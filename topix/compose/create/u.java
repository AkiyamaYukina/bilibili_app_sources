package com.bilibili.topix.compose.create;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.topix.model.TopicCreationResult;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import kotlin.Unit;
import kotlinx.serialization.json.Json;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/u.class */
public final /* synthetic */ class u implements BiliCommonDialog.OnDialogTextClickListener, OnConnectionSucceedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f112560b;

    public /* synthetic */ u(Object obj, Object obj2) {
        this.f112559a = obj;
        this.f112560b = obj2;
    }

    public void onConnectionSucceed() {
        ((wy.d) this.f112559a).i = true;
        ((wy.a) this.f112560b).invoke(Boolean.TRUE);
    }

    public void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        FragmentActivity fragmentActivityP3 = ((CreateTopicComposeFragment) this.f112559a).p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            Json.Default r02 = Json.Default;
            r02.getSerializersModule();
            intent.putExtra("publish_result", r02.encodeToJsonElement(TopicCreationResult.Companion.serializer(), (TopicCreationResult) this.f112560b).toString());
            Unit unit = Unit.INSTANCE;
            fragmentActivityP3.setResult(-1, intent);
            fragmentActivityP3.finish();
        }
    }
}
