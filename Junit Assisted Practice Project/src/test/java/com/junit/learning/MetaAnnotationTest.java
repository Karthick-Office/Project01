package com.junit.learning;
import java.lang.annotation.Annotation;
public class MetaAnnotationTest implements MetaAnnotation {
	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}

	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
	

}