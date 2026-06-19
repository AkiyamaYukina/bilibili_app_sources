package com.bilibili.biligame.api;

import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCopyWriting.class */
public class BiligameCopyWriting {
    public static final String KEY_BOOK = "book";
    public static final String KEY_CANCEL_BOOK = "cancel_book";
    public static final String KEY_RANK = "cw_rank_list";

    @JSONField(name = KEY_BOOK)
    public BookData bookData;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCopyWriting$BookData.class */
    public static class BookData {

        @JSONField(name = "sub_copywriting")
        public String bookSubtitle;

        @JSONField(name = "copywriting")
        public String bookTitle;

        @JSONField(name = "key")
        public String key;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCopyWriting$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @JSONField(name = "key")
        public String f62145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @JSONField(name = "copywriting")
        public String f62146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JSONField(name = "image")
        public String f62147c;
    }
}
