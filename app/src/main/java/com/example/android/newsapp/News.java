package com.example.android.newsapp;

public class News {
    private String mSectionName;
    private String mArticleTitle;
    private String mDate;
    private String mUrl;

    public News(String SectionName, String ArticleTitle, String Date, String Url) {
        mSectionName = SectionName;
        mArticleTitle = ArticleTitle;
        mDate = Date;
        mUrl = Url;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
