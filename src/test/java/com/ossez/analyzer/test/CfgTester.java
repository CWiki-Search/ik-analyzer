/**
 * 
 */
package com.ossez.analyzer.test;

import com.ossez.analyzer.cfg.Configuration;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class CfgTester extends TestCase{
	
	public void testCfgLoading(){
		System.out.println(Configuration.getExtDictionarys().size());
		System.out.println(Configuration.getExtStopWordDictionarys().size());
	}

}
