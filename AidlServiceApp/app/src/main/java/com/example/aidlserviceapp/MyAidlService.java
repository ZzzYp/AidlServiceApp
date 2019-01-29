package com.example.aidlserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyAidlService extends Service {
    public MyAidlService() {
    }


    //============================================================================
    private final String emailAidl = "18744444444@163.com";
    private final String passwordAidl = "187adaddadadad@163.com";
    List<AidlLoginInfoBean> aidlLoginInfoBeans = null;

    AidlLoginInfoBeanManager.Stub stub = new AidlLoginInfoBeanManager.Stub() {
        @Override
        public List<AidlLoginInfoBean> getAidlLoginInfoBean() throws RemoteException {

            AidlLoginInfoBean aidlLoginInfoBean = new AidlLoginInfoBean();
            aidlLoginInfoBean.setEmail(emailAidl);
            aidlLoginInfoBean.setPassword(passwordAidl);

            if (null == aidlLoginInfoBeans) {
                aidlLoginInfoBeans = new ArrayList<>();
            }
            aidlLoginInfoBeans.add(aidlLoginInfoBean);
            return aidlLoginInfoBeans;
        }

        @Override
        public void addAidlLoginInfoBean(AidlLoginInfoBean aidlLoginInfoBean) throws RemoteException {
            if (null == aidlLoginInfoBeans) {
                aidlLoginInfoBeans = new ArrayList<>();
            }
            if (null == aidlLoginInfoBean) {
                aidlLoginInfoBean = new AidlLoginInfoBean();
            }
            Log.e("zyp", " MyAidlService  :" + aidlLoginInfoBean.toString());
            aidlLoginInfoBeans.add(aidlLoginInfoBean);
        }
    };

    //============================================================================


    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }
}
