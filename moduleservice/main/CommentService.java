package com.bilibili.moduleservice.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import androidx.fragment.app.FragmentActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService.class */
public interface CommentService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$IInputSupplementaryConfig.class */
    public interface IInputSupplementaryConfig {
        @NotNull
        b getBackground();

        @NotNull
        e getButtonEnable();

        @Nullable
        DialogInterface.OnDismissListener getOnDismissListener();

        @Nullable
        d getOnSendListener();

        @Nullable
        DialogInterface.OnShowListener getOnShowListener();

        @NotNull
        c getVisibleRectChangeListener();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$ReplyCommentInfo.class */
    public static final class ReplyCommentInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f66315b;

        public ReplyCommentInfo(long j7, @NotNull String str) {
            this.f66314a = j7;
            this.f66315b = str;
        }

        @NotNull
        public final String getNickName() {
            return this.f66315b;
        }

        public final long getRpid() {
            return this.f66314a;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Boolean f66316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Boolean f66317b;

        public a(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.f66316a = bool;
            this.f66317b = bool2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$b.class */
    public interface b {
        int a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$c.class */
    public interface c {
        void a(@NotNull Rect rect);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$d.class */
    public interface d {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$d$a.class */
        public static final class a {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$d$b.class */
        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f66318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f66319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final String f66320c;

            public b(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                this.f66318a = str;
                this.f66319b = str2;
                this.f66320c = str3;
            }
        }

        void a(@NotNull b bVar);

        void b(@NotNull a aVar);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/CommentService$e.class */
    public interface e {
        @NotNull
        a a();

        @NotNull
        a b();

        @NotNull
        a c();

        @NotNull
        a d();

        @NotNull
        a e();

        @NotNull
        a f();

        @NotNull
        a g();

        @NotNull
        a getCheckBox();
    }

    static /* synthetic */ boolean openCommentInputBar$default(CommentService commentService, FragmentActivity fragmentActivity, long j7, int i7, long j8, int i8, ReplyCommentInfo replyCommentInfo, String str, String str2, CommentInputCallback commentInputCallback, IInputSupplementaryConfig iInputSupplementaryConfig, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCommentInputBar");
        }
        if ((i9 & 512) != 0) {
            iInputSupplementaryConfig = null;
        }
        return commentService.openCommentInputBar(fragmentActivity, j7, i7, j8, i8, replyCommentInfo, str, str2, commentInputCallback, iInputSupplementaryConfig);
    }

    void callbackActivityResult(int i7, int i8, @Nullable Intent intent);

    void commentIntentInterceptor(@Nullable Context context, @Nullable String str, @Nullable String str2);

    boolean openCommentInputBar(@NotNull FragmentActivity fragmentActivity, long j7, int i7, long j8, int i8, @Nullable ReplyCommentInfo replyCommentInfo, @Nullable String str, @Nullable String str2, @Nullable CommentInputCallback commentInputCallback, @Nullable IInputSupplementaryConfig iInputSupplementaryConfig);

    void release(@Nullable Activity activity);
}
