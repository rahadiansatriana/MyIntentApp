package id.co.sigma.android.myintentapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sidiq on 29/08/2016.
 */
public class Gift implements Parcelable {
    private String name;
    private String id;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.id);
        dest.writeString(this.url);
    }

    public Gift() {
    }

    protected Gift(Parcel in) {
        this.name = in.readString();
        this.id = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<Gift> CREATOR = new Parcelable.Creator<Gift>() {
        @Override
        public Gift createFromParcel(Parcel source) {
            return new Gift(source);
        }

        @Override
        public Gift[] newArray(int size) {
            return new Gift[size];
        }
    };
}
