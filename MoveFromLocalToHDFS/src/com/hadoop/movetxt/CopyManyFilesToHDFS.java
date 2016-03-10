package com.hadoop.movetxt;

import java.io.IOException;

import org.apache.hadoop.io.IOUtils;

public class CopyManyFilesToHDFS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String srcPath = "C:/Users/zp/Desktop/move_hdfs/*";
		
		String dstPath = "hdfs://zhengpeng:9000/dajiangtai_copy";
		
		MoveTxt.move(srcPath, dstPath);
		
	}

}
