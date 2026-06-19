package com.bilibili.topix.create;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.topix.model.TopicCreationResult;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/c.class */
public final /* synthetic */ class c implements BiliCommonDialog.OnDialogTextClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateTopicFragment f112593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopicCreationResult f112594b;

    public /* synthetic */ c(CreateTopicFragment createTopicFragment, TopicCreationResult topicCreationResult) {
        this.f112593a = createTopicFragment;
        this.f112594b = topicCreationResult;
    }

    public final void onDialogTextClicked(View view, BiliCommonDialog biliCommonDialog) {
        KProperty<Object>[] kPropertyArr = CreateTopicFragment.f112575d;
        FragmentActivity fragmentActivityP3 = this.f112593a.p3();
        if (fragmentActivityP3 != null) {
            Intent intent = new Intent();
            Json.Default r02 = Json.Default;
            r02.getSerializersModule();
            intent.putExtra("publish_result", r02.encodeToJsonElement(TopicCreationResult.Companion.serializer(), this.f112594b).toString());
            Unit unit = Unit.INSTANCE;
            fragmentActivityP3.setResult(-1, intent);
            fragmentActivityP3.finish();
        }
    }
}
