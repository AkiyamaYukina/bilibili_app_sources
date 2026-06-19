package com.bilibili.teenagersmode.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.opd.app.bizcommon.radar.ui.data.RadarNotificationBean;
import com.bilibili.upper.module.cover.ui.UpperCoverSettingActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import on0.C8247o;
import on0.InterfaceC8245m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/h.class */
public final /* synthetic */ class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f110674b;

    public /* synthetic */ h(int i7, BaseAppCompatActivity baseAppCompatActivity) {
        this.f110673a = i7;
        this.f110674b = baseAppCompatActivity;
    }

    public /* synthetic */ h(RadarNotificationBean radarNotificationBean, TextView textView) {
        this.f110673a = 2;
        this.f110674b = radarNotificationBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f110673a) {
            case 0:
                TeenagersModeActivity teenagersModeActivity = (TeenagersModeActivity) this.f110674b;
                int i7 = TeenagersModeActivity.f110612G;
                if (!teenagersModeActivity.isFragmentStateSaved()) {
                    teenagersModeActivity.onBackPressed();
                    break;
                }
                break;
            case 1:
                UpperCoverSettingActivity upperCoverSettingActivity = (UpperCoverSettingActivity) this.f110674b;
                int i8 = UpperCoverSettingActivity.f112730R;
                Neurons.reportClick(false, "creation.new-publish.cover-set.edit.click", new LinkedHashMap());
                Bundle bundleExtra = upperCoverSettingActivity.getIntent().getBundleExtra("param_control");
                if (bundleExtra != null) {
                    final String string = bundleExtra.getString("input_type_id");
                    final String string2 = bundleExtra.getString("input_video_path");
                    final String string3 = bundleExtra.getString("input_image_path");
                    final String string4 = bundleExtra.getString("output_image_path");
                    final String string5 = bundleExtra.getString("input_selected_path");
                    final String string6 = bundleExtra.getString("input_cover_key");
                    EH0.p pVar = EH0.p.f4125a;
                    final String str = upperCoverSettingActivity.f112741L;
                    final String str2 = upperCoverSettingActivity.f112742M;
                    final long j7 = upperCoverSettingActivity.f112743N;
                    final long j8 = upperCoverSettingActivity.f112744O;
                    final int i9 = upperCoverSettingActivity.f112746Q;
                    pVar.getClass();
                    if (!EH0.p.i()) {
                        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper//cover_editor/")).extras(new Function1(i9, j7, j8, string6, string, string2, string3, string5, string4, str, str2) { // from class: EH0.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final String f4047a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f4048b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final String f4049c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final String f4050d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final String f4051e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final String f4052f;

                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                            public final String f4053g;
                            public final String h;

                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                            public final long f4054i;

                            /* JADX INFO: renamed from: j, reason: collision with root package name */
                            public final long f4055j;

                            /* JADX INFO: renamed from: k, reason: collision with root package name */
                            public final int f4056k;

                            {
                                this.f4047a = string6;
                                this.f4048b = string;
                                this.f4049c = string2;
                                this.f4050d = string3;
                                this.f4051e = string5;
                                this.f4052f = string4;
                                this.f4053g = str;
                                this.h = str2;
                                this.f4054i = j7;
                                this.f4055j = j8;
                                this.f4056k = i9;
                            }

                            public final Object invoke(Object obj) {
                                MutableBundleLike mutableBundleLike = (MutableBundleLike) obj;
                                Bundle bundle = new Bundle();
                                bundle.putString("coverEditStrategyId", com.bilibili.upper.module.contribute.up.ui.e.a ? "16:9_mix_4:3" : "4:3_16:9");
                                bundle.putString("input_cover_key", this.f4047a);
                                bundle.putString("input_type_id", this.f4048b);
                                bundle.putString("input_video_path", this.f4049c);
                                bundle.putString("input_image_path", this.f4050d);
                                bundle.putString("input_selected_path", this.f4051e);
                                bundle.putString("output_image_path", this.f4052f);
                                bundle.putString("key_main_cover_path", this.f4053g);
                                bundle.putString("key_sub_cover_path", this.h);
                                bundle.putLong("key_cover_pos", this.f4054i);
                                bundle.putLong("key_sub_cover_path", this.f4055j);
                                bundle.putBoolean("cover_169_enable", true);
                                bundle.putInt("cover_from_where", this.f4056k);
                                mutableBundleLike.put("param_control", bundle);
                                return Unit.INSTANCE;
                            }
                        }).requestCode(2233).build(), upperCoverSettingActivity);
                        break;
                    }
                }
                break;
            default:
                RadarNotificationBean radarNotificationBean = (RadarNotificationBean) this.f110674b;
                int i10 = C8247o.f124843r;
                InterfaceC8245m listener = radarNotificationBean.getListener();
                if (listener != null) {
                    listener.b();
                }
                break;
        }
    }
}
