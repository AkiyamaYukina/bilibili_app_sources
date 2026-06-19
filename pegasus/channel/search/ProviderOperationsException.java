package com.bilibili.pegasus.channel.search;

import android.net.Uri;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/search/ProviderOperationsException.class */
public class ProviderOperationsException extends RuntimeException {
    public ProviderOperationsException(String str, Uri uri, Throwable th) {
        this("Error occurred while doing operation '" + str + "' on uri " + uri, th);
    }

    private ProviderOperationsException(String str, Throwable th) {
        super(str, th);
    }
}
