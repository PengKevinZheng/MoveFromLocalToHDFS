package com.hadoop.movetxt;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FileUtil;
import org.apache.hadoop.fs.Path;

public class MoveTxt {
	
	public static void move(String srcPath,String desPath) throws IOException{
		// get hdfs from the configuration
		Configuration conf = new Configuration();
		String uri = "hdfs://zhengpeng:9000";
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		
		
		// get local info from conf
		FileSystem local = FileSystem.getLocal(conf);
		
		// filter all the txt from the folder
		FileStatus[] localStatus = local.globStatus(new Path(srcPath),new RegexAcceptPathFilter("^.*txt$"));
		
		// get the path of txt files
		Path[] listedPaths = FileUtil.stat2Paths(localStatus);
		
		
		Path out = new Path(desPath);
		
		for(Path p:listedPaths) {
			fs.copyFromLocalFile(p, out);
		}
		
		
		
		
	}
}
