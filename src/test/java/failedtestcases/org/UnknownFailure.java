package failedtestcases.org;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class UnknownFailure implements org.testng.IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testclass, Constructor testconstructor, Method tc3) {
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		if (retryAnalyzer==null) {
			annotation.setRetryAnalyzer(KnownFailure.class);
		}
		
	}
}
