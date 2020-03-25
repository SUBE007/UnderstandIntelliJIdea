 package com.gradle.java;

 import sun.management.MethodInfo;
 import java.lang.annotation.Annotation;
 import java.lang.reflect.Method;

public class AnnotationExample {
    @Override
    @MethodInfo(author="Narayan",comments="Main Method",date="Mar 25 2020",revision=1)
    public String toString(){
        return "Overriden toString Method";
    }
    @Deprecated
    @MethodInfo(comments="depricated Method",date="25 Marc 2020")
    public static void oldMethod(){
        System.out.println("Old Method Don't Use it");
    }

    public static void main(String []args){
        try {
                for (Method method:AnnotationExample.class.getMethods()){
                    if (method.isAnnotationPresent((Class<? extends Annotation>) MethodInfo.class)){
                       try {
                           for (Annotation anno:method.getDeclaredAnnotations()){
                               System.out.println("Annotation in Method: "+method+":"+anno);
                           }
                           MethodInfo methodAnno=method.getAnnotation(MethodInfo.class);
                           if (methodAnno.revision()==1){
                               System.out.println("Method with rivision no.1: "+method);
                           }
                       }catch (Throwable ex){
                           ex.printStackTrace();
                       }
                    }
                }
        }catch (SecurityException se){
              se.printStackTrace();
        }
    }

}
