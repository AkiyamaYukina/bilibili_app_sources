package com.bilibili.ogv.review.detailpage;

import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.ogv.review.widget.ReviewRatingBar;
import com.bilibili.upper.module.contribute.up.ui.section.VideoSectionActivity;
import com.bilibili.upper.module.contribute.up.ui.section.vm.VideoSectionVM;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/q.class */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f72391b;

    public /* synthetic */ q(Object obj, int i7) {
        this.f72390a = i7;
        this.f72391b = obj;
    }

    public final Object invoke() {
        Object obj = this.f72391b;
        switch (this.f72390a) {
            case 0:
                return (ReviewRatingBar) ((View) obj).findViewById(2131309864);
            case 1:
                System.load(((File) obj).getAbsolutePath());
                return Unit.INSTANCE;
            default:
                int i7 = VideoSectionActivity.M;
                return new ViewModelProvider((VideoSectionActivity) obj).get(VideoSectionVM.class);
        }
    }
}
