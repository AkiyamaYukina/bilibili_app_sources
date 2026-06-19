package com.bilibili.upper.module.manuscript.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.upper.api.bean.manuscript.VideoViolationPic;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import com.bilibili.upper.module.manuscript.bean.ProblemDetailBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/model/b.class */
@StabilityInferred(parameters = 0)
public final class b extends ArchiveAppealViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f113666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f113667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ProblemDetailBean f113668g;

    public static void L0(AuditReason auditReason, List list) {
        auditReason.f113572i = new ArrayList();
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VideoViolationPic videoViolationPic = (VideoViolationPic) obj;
            AuditReason.ViolationPic violationPic = new AuditReason.ViolationPic();
            violationPic.url = videoViolationPic.url;
            violationPic.timeStr = videoViolationPic.time;
            ((ArrayList) auditReason.f113572i).add(violationPic);
            i7++;
        }
    }
}
