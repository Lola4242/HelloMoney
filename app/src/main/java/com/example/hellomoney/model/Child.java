package com.example.hellomoney.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Child implements Parcelable{

    private String firstName;
    int Avatar;

    public Child(Parcel in) {
        firstName = in.readString();
        Avatar = in.readInt();
    }

    public static final Creator<Child> CREATOR = new Creator<Child>() {
        @Override
        public Child createFromParcel(Parcel in) {
            return new Child(in);
        }

        @Override
        public Child[] newArray(int size) {
            return new Child[size];
        }
    };

    public Child() {

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeInt(Avatar);
    }
}
