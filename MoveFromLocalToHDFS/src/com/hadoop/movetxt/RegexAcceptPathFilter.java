package com.hadoop.movetxt;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathFilter;



/**
 * @author zp
 *
 */
public class RegexAcceptPathFilter implements PathFilter {
	
	private final String regex;
	
	public RegexAcceptPathFilter(String regex) {
		super();
		this.regex = regex;
	}

	@Override
	public  boolean accept(Path path) {
		// TODO Auto-generated method stub
		boolean flag = path.toString().matches(regex);
		return flag;
	}

}
