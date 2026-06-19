package com.bilibili.upper.module.topic.activity;

import ES0.E;
import Ob1.Y;
import QI0.c;
import QI0.f;
import QI0.g;
import QI0.h;
import RI0.d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import bF0.H;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.upper.api.bean.topic.Topic;
import com.bilibili.upper.module.topic.activity.TopicSearchActivity;
import com.bilibili.upper.module.topic.vm.TopicSearchViewModel;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/topic/activity/TopicSearchActivity.class */
@StabilityInferred(parameters = 0)
public final class TopicSearchActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f114065G = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final Lazy f114066D = LazyKt.lazy(new E(this, 2));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final d f114067E = new d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public H f114068F;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/topic/activity/TopicSearchActivity$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f114069a;

        public a(c cVar) {
            this.f114069a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f114069a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f114069a.invoke(obj);
        }
    }

    public final void Q6(Topic topic) {
        Intent intent = new Intent();
        intent.putExtra(CaptureSchema.MISSION_ID, topic.mission_id);
        intent.putExtra("is_created_topic", topic.isCreated);
        intent.putExtra(CaptureSchema.TOPIC_ID, topic.id);
        intent.putExtra(CaptureSchema.TOPIC_NAME, topic.name);
        intent.putExtra("topic_desc", topic.description);
        if (!TextUtils.isEmpty(topic.uname)) {
            intent.putExtra("topic_user_tips", R6().f114076i);
        }
        intent.putExtra("activity_name", topic.activity_sign);
        intent.putExtra("activity_desc", topic.act_protocol);
        setResult(-1, intent);
        finish();
    }

    public final TopicSearchViewModel R6() {
        return (TopicSearchViewModel) this.f114066D.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.topic.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        String stringExtra;
        super.onActivityResult(i7, i8, intent);
        if (i8 != -1 || i7 != 1 || intent == null || (stringExtra = intent.getStringExtra("publish_result")) == null) {
            return;
        }
        JSONObject object = JSON.parseObject(stringExtra);
        Topic topic = new Topic();
        topic.id = object.getLong(CaptureSchema.TOPIC_ID).longValue();
        topic.name = object.getString(CaptureSchema.TOPIC_NAME);
        topic.description = object.getString("success_desc");
        topic.isCreated = true;
        Q6(topic);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE)) != null) {
            R6().f114074f = bundleExtra.getBoolean("force_night", false);
            if (R6().f114074f) {
                R6().h = MultipleThemeUtils.getCurrentThemeId(this);
                MultipleThemeUtils.setCurrentTheme(1);
            }
        }
        H hInflate = H.inflate(LayoutInflater.from(this));
        this.f114068F = hInflate;
        setContentView(hInflate != null ? hInflate.f54795a : null);
        ensureToolbar();
        H h = this.f114068F;
        if (h != null) {
            h.f54800f.setOnClickListener(new Y(this, 1));
        }
        H h7 = this.f114068F;
        if (h7 != null) {
            h7.f54797c.setOnClickListener(new QI0.a(this, 0));
        }
        H h8 = this.f114068F;
        d dVar = this.f114067E;
        if (h8 != null) {
            h8.f54799e.setAdapter(dVar);
        }
        H h9 = this.f114068F;
        if (h9 != null) {
            h9.f54799e.addOnScrollListener(new f(this));
        }
        dVar.f20780b = new g(this);
        H h10 = this.f114068F;
        if (h10 != null) {
            h10.f54796b.addTextChangedListener(new h(this));
        }
        H h11 = this.f114068F;
        if (h11 != null) {
            h11.f54796b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) { // from class: QI0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TopicSearchActivity f19865a;

                {
                    this.f19865a = this;
                }

                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                    TopicSearchActivity topicSearchActivity = this.f19865a;
                    int i8 = TopicSearchActivity.f114065G;
                    Integer numValueOf = keyEvent != null ? Integer.valueOf(keyEvent.getKeyCode()) : null;
                    boolean z6 = false;
                    if ((numValueOf != null && numValueOf.intValue() == 66) || (numValueOf != null && numValueOf.intValue() == 0)) {
                        topicSearchActivity.R6().I0(textView.getText().toString(), false);
                        z6 = true;
                    }
                    return z6;
                }
            });
        }
        Intent intent2 = getIntent();
        Bundle bundleExtra2 = null;
        if (intent2 != null) {
            bundleExtra2 = intent2.getBundleExtra(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
        }
        R6().f114075g = bundleExtra2 != null ? bundleExtra2.getBoolean("topic_opt", false) : false;
        dVar.f20781c = R6().f114075g;
        R6().f114070b.observe(this, new a(new c(this, 0)));
        if (bundleExtra2 != null) {
            R6().f114078k = bundleExtra2.getBoolean("can_create_topic", false);
            R6().f114073e = bundleExtra2.getString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, "");
        }
        new Handler(getMainLooper()).postDelayed(new QI0.d(this, 0), 200L);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (R6().f114074f) {
            MultipleThemeUtils.setCurrentTheme(R6().h);
        }
    }
}
