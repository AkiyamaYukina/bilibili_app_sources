package com.bilibili.ogv.misc.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.SwitchPreferenceCompat;
import nk0.C8103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/preference/ReportSwitchPreference.class */
public class ReportSwitchPreference extends SwitchPreferenceCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69164d;

    public ReportSwitchPreference(Context context) {
        super(context);
        b(context, null, 0);
    }

    public ReportSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet, 0);
    }

    public ReportSwitchPreference(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b(context, attributeSet, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.preference.Preference$OnPreferenceChangeListener, java.lang.Object] */
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8103a.f124254b, i7, 0);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        this.f69161a = typedArrayObtainStyledAttributes.getString(2);
        this.f69162b = typedArrayObtainStyledAttributes.getString(1);
        this.f69163c = typedArrayObtainStyledAttributes.getString(3);
        this.f69164d = typedArrayObtainStyledAttributes.getString(0);
        if (!TextUtils.isEmpty(this.f69161a) && !TextUtils.isEmpty(this.f69162b) && !TextUtils.isEmpty(this.f69163c) && !TextUtils.isEmpty(this.f69164d)) {
            setOnPreferenceChangeListener(new Object());
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
