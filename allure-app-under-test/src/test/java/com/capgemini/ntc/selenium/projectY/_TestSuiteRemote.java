package com.capgemini.ntc.selenium.projectY;

import org.junit.runner.RunWith;

import com.capgemini.ntc.core.groupTestCases.testSuites.tags.TestLocal;
import com.capgemini.ntc.core.groupTestCases.testSuites.tags.TestsNONParallel;
import com.capgemini.ntc.test.core.utils.junitoolboxpi.WildcardPatternSuiteBF;
import com.googlecode.junittoolbox.ExcludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;

@RunWith(WildcardPatternSuiteBF.class)
@ExcludeCategories({ TestLocal.class, TestsNONParallel.class })
@SuiteClasses({ "**/projectY/*Test.class" })

public class _TestSuiteRemote {
	
}
