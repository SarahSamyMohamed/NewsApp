package com.example.android.newsapp;

public class News {
    private String mSectionName;
    private String mArticleTitle;
    private String mDate;
    private String mUrl;
    private String mAuthor;

    public News(String SectionName, String ArticleTitle, String Date, String Url, String Author) {
        mSectionName = SectionName;
        mArticleTitle = ArticleTitle;
        mDate = Date;
        mUrl = Url;
        mAuthor = Author;
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

    public String getAuthor() {
        return mAuthor;
    }
}
