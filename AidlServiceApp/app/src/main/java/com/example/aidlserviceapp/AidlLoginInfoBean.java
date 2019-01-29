package com.example.aidlserviceapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2019-01-02.
 */

public class AidlLoginInfoBean implements Parcelable {
    private String email;

    private String password;

    public AidlLoginInfoBean() {
    }

    public AidlLoginInfoBean(Parcel source) {
        email = source.readString();
        password = source.readString();
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(password);
    }


    public static final Creator<AidlLoginInfoBean> CREATOR = new Creator<AidlLoginInfoBean>() {
        @Override
        public AidlLoginInfoBean createFromParcel(Parcel source) {
            return new AidlLoginInfoBean(source);
        }

        @Override
        public AidlLoginInfoBean[] newArray(int size) {
            return new AidlLoginInfoBean[size];
        }
    };


    @Override
    public String toString() {
        return "email : " + email + " password :" + password;
    }


    /**
     * 参数是一个Parcel,用它来存储与传输数据
     *
     * @param dest
     */
    public void readFromParcel(Parcel dest) {
        //注意，此处的读值顺序应当是和writeToParcel()方法中一致的
        email = dest.readString();
        password = dest.readString();
    }

}
