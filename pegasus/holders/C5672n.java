package com.bilibili.pegasus.holders;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.data.FeedbackType;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/n.class */
@StabilityInferred(parameters = 0)
public class C5672n extends C5647b {

    /* JADX INFO: renamed from: com.bilibili.pegasus.holders.n$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/n$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f77900a;

        static {
            int[] iArr = new int[FeedbackType.values().length];
            try {
                iArr[FeedbackType.FEEDBACK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FeedbackType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f77900a = iArr;
        }
    }
}
