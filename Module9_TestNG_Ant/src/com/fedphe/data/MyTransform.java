package com.fedphe.data;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.util.RetryAnalyzerCount;

public class MyTransform  implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzerCount.class);
		
	}

}
