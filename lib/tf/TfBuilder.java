package com.bilibili.lib.tf;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.tf.sp.MobileServiceConfig;
import com.bilibili.lib.tf.sp.TelecomServiceConfig;
import com.bilibili.lib.tf.sp.UnicomServiceConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfBuilder.class */
public class TfBuilder {
    private long activateMaxAge;
    private Context context;
    private boolean debug;

    @NonNull
    private TfDelegate delegate;
    private boolean ignetCAPIEnabled;

    @Nullable
    private MobileServiceConfig mobile;

    @NonNull
    private String storagePath;

    @Nullable
    private TelecomServiceConfig telecom;

    @Nullable
    private TfTrack track;

    @Nullable
    private UnicomServiceConfig unicom;
    private boolean enabled = true;
    private boolean trackEnabled = true;

    public TfBuilder(Context context) {
        this.context = context;
    }

    public long activateMaxAge() {
        return this.activateMaxAge;
    }

    public TfBuilder activateMaxAge(long j7) {
        this.activateMaxAge = j7;
        return this;
    }

    @NonNull
    public Tf build() {
        return new Tf(this);
    }

    public TfBuilder debug(boolean z6) {
        this.debug = z6;
        return this;
    }

    public boolean debug() {
        return this.debug;
    }

    public TfBuilder delegate(@NonNull TfDelegate tfDelegate) {
        this.delegate = tfDelegate;
        return this;
    }

    @NonNull
    public TfDelegate delegate() {
        return this.delegate;
    }

    public TfBuilder enable(boolean z6) {
        this.enabled = z6;
        return this;
    }

    public boolean enabled() {
        return this.enabled;
    }

    public Context getContext() {
        return this.context;
    }

    public TfBuilder ignetCAPIEnable(boolean z6) {
        this.ignetCAPIEnabled = z6;
        return this;
    }

    public boolean ignetCAPIEnabled() {
        return this.ignetCAPIEnabled;
    }

    public TfBuilder mobile(@NonNull MobileServiceConfig mobileServiceConfig) {
        this.mobile = mobileServiceConfig;
        return this;
    }

    @Nullable
    public MobileServiceConfig mobile() {
        return this.mobile;
    }

    public TfBuilder storagePath(@NonNull String str) {
        this.storagePath = str;
        return this;
    }

    @NonNull
    public String storagePath() {
        return this.storagePath;
    }

    public TfBuilder telecom(@NonNull TelecomServiceConfig telecomServiceConfig) {
        this.telecom = telecomServiceConfig;
        return this;
    }

    @Nullable
    public TelecomServiceConfig telecom() {
        return this.telecom;
    }

    public TfBuilder track(@Nullable TfTrack tfTrack) {
        this.track = tfTrack;
        return this;
    }

    @Nullable
    public TfTrack track() {
        return this.track;
    }

    public TfBuilder trackEnable(boolean z6) {
        this.trackEnabled = z6;
        return this;
    }

    public boolean trackEnabled() {
        return this.trackEnabled;
    }

    public TfBuilder unicom(@NonNull UnicomServiceConfig unicomServiceConfig) {
        this.unicom = unicomServiceConfig;
        return this;
    }

    @Nullable
    public UnicomServiceConfig unicom() {
        return this.unicom;
    }
}
