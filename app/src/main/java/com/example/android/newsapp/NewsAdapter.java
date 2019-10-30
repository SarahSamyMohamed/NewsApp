package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionNameTextView = listItemView.findViewById(R.id.section_name);
        sectionNameTextView.setText(currentNews.getSectionName());

        TextView articleTitleTextView = listItemView.findViewById(R.id.article_title);
        articleTitleTextView.setText(currentNews.getArticleTitle());

        TextView dateTextView = listItemView.findViewById(R.id.date);
        dateTextView.setText(currentNews.getmDate());

        TextView authorTextView = listItemView.findViewById(R.id.author_name);
        authorTextView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
