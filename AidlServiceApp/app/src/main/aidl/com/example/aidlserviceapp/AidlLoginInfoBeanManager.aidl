// AidlLoginInfoBeanManager.aidl
package com.example.aidlserviceapp;

import com.example.aidlserviceapp.AidlLoginInfoBean;
// Declare any non-default types here with import statements

interface AidlLoginInfoBeanManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
//    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
//            double aDouble, String aString);
     List<AidlLoginInfoBean> getAidlLoginInfoBean();

     void addAidlLoginInfoBean(in AidlLoginInfoBean aidlLoginInfoBean);
}
