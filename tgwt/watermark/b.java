package com.bilibili.tgwt.watermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.player.widget.m;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BangumiPlayerContainerService f112309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayControlService f112310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lifecycle f112311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f112312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f112313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Rl.e f112314f;

    @Inject
    public b(@NotNull BangumiPlayerContainerService bangumiPlayerContainerService, @NotNull PlayControlService playControlService, @NotNull Lifecycle lifecycle, @NotNull a aVar, @NotNull BiliAccounts biliAccounts) {
        this.f112309a = bangumiPlayerContainerService;
        this.f112310b = playControlService;
        this.f112311c = lifecycle;
        this.f112312d = aVar;
        this.f112313e = biliAccounts;
        this.f112314f = bangumiPlayerContainerService.getPlayerServiceController();
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), (CoroutineContext) null, (CoroutineStart) null, new PlayerWatermarkService$1(this, null), 3, (Object) null);
    }

    public final void a(@NotNull m mVar) {
        BuildersKt.launch$default(LifecycleKt.getCoroutineScope(this.f112311c), (CoroutineContext) null, (CoroutineStart) null, new PlayerWatermarkService$init$1(this, mVar, null), 3, (Object) null);
        String strValueOf = String.valueOf(this.f112313e.mid());
        Context context = mVar.getContext();
        float fA = Uj0.c.a(14, context);
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setColor(ContextCompat.getColor(context, 2131100106));
        textPaint.setAlpha(90);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setFakeBoldText(false);
        textPaint.setTextSkewX(0.0f);
        textPaint.setTextSize(fA);
        Rect rect = new Rect();
        textPaint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        int i7 = rect.bottom;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.left;
        double radians = Math.toRadians(((double) 20.0f) * 1.0d);
        double d7 = i9 - i10;
        double dCos = Math.cos(radians);
        double d8 = i7 - i8;
        int iCeil = (int) Math.ceil((Math.sin(radians) * d8) + (dCos * d7));
        int iCeil2 = (int) Math.ceil((Math.cos(radians) * d8) + (Math.sin(radians) * d7));
        int i11 = (int) (iCeil + fA);
        float f7 = iCeil2 + fA;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11 + 80, ((int) f7) + 40, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.translate(fA, f7 + 40);
        canvas.rotate(-20.0f);
        canvas.drawText(strValueOf, 0.0f, 0.0f, textPaint);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setDither(true);
        mVar.setBackground(bitmapDrawable);
    }
}
