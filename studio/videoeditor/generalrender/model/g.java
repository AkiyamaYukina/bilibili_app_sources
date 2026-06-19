package com.bilibili.studio.videoeditor.generalrender.model;

import com.bilibili.lib.videoupload.Profile;
import com.bilibili.lib.videoupload.ProfileWrapper;
import com.bilibili.okretro.BiliApiDataCallback;
import kntr.common.upper.trace.EventLevel;
import kntr.common.upper.trace.ITraceManager;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import sw0.C8629b;
import sw0.C8631d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/g.class */
public final class g extends BiliApiDataCallback<ProfileWrapper> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1<Profile, Unit> f109605b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Function1<? super Profile, Unit> function1) {
        this.f109605b = function1;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(ProfileWrapper profileWrapper) {
        Profile profile;
        ProfileWrapper profileWrapper2 = profileWrapper;
        if (profileWrapper2 == null || (profile = profileWrapper2.getProfile()) == null) {
            return;
        }
        int length = profile.getUpload().length();
        Function1<Profile, Unit> function1 = this.f109605b;
        if (length == 0 || profile.getMeta().length() == 0) {
            C8629b.a(null);
            function1.invoke(new Profile());
            return;
        }
        String str = C8629b.f127386a;
        String upload = profile.getUpload();
        String meta = profile.getMeta();
        if (pw0.b.a()) {
            String str2 = upload;
            if (upload == null) {
                str2 = "";
            }
            Pair pair = TuplesKt.to("video_profile", str2);
            String str3 = meta;
            if (meta == null) {
                str3 = "";
            }
            ITraceManager.process$default(C8631d.f127390b, "导出参数请求", "uper_activity_transcoding_parameters_resp_success", "【导出参数请求】请求导出参数成功", (EventLevel) null, (String) null, MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("meta_profile", str3), TuplesKt.to("current_time", String.valueOf(System.currentTimeMillis()))}), false, false, 216, (Object) null);
        }
        function1.invoke(profile);
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String str = C8629b.f127386a;
        C8629b.a(th != null ? th.getMessage() : null);
        this.f109605b.invoke(new Profile());
    }
}
