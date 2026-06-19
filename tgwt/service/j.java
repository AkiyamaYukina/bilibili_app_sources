package com.bilibili.tgwt.service;

import com.bilibili.lib.fileupload.FileUploadManager;
import com.bilibili.lib.fileupload.FileUploadTask;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/j.class */
public final class j implements db0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111970a;

    public j(ChatService chatService) {
        this.f111970a = chatService;
    }

    public final void a() {
        ChatService chatService = this.f111970a;
        chatService.m(1.0f);
        if (chatService.f111874W) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - chatService.f111875X) / ((long) 1000);
            chatService.f111875X = jCurrentTimeMillis;
            String str = chatService.f111873V;
            int i7 = (int) jCurrentTimeMillis;
            if (!StringsKt.isBlank(str) && cn.com.chinatelecom.account.api.d.m.b(str)) {
                FileUploadTask fileUploadTaskBuild = new FileUploadTask.Builder().setProfile("freya/st-android").setBuildFrom(2).setFilePath(str).build();
                fileUploadTaskBuild.addUploadCallback(new k(chatService, i7));
                FileUploadManager.Companion.getInstance().addUploadTask(fileUploadTaskBuild);
            }
        }
    }

    public final void onRecordStart(Long l7, String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        ChatService chatService = this.f111970a;
        chatService.f111873V = str2;
        chatService.m(0.1f);
        chatService.f111875X = System.currentTimeMillis();
    }
}
