package com.elbbbird.android.socialsdk.model;

/**
 * 社会化分享数据类
 * Created by zhanghailong-ms on 2015/11/23.
 */
public class SocialShareScene {

    public static final int SHARE_TYPE_DEFAULT = 0;
    public static final int SHARE_TYPE_WEIBO = 1;
    public static final int SHARE_TYPE_WECHAT = 2;
    public static final int SHARE_TYPE_WECHAT_TIMELINE = 3;
    public static final int SHARE_TYPE_QQ = 4;
    public static final int SHARE_TYPE_QZONE = 5;

    private int id;
    private int type;
    private String title;
    private String desc;
    private String thumbnail;
    private String url;

    /**
     * @param type      分享类型
     * @param title     标题
     * @param desc      简短描述
     * @param thumbnail 缩略图网址
     * @param url       WEB网址
     */
    public SocialShareScene(int id, int type, String title, String desc, String thumbnail, String url) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.desc = desc;
        this.thumbnail = thumbnail;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
