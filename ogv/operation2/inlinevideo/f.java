package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.card.IInlineCard;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.plugin.DefaultCardPlayBehaviorWrap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/f.class */
@StabilityInferred(parameters = 0)
public final class f extends DefaultCardPlayBehaviorWrap {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f70930j = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final b f70931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final a f70932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70933g;
    private long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f70934i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/f$a.class */
    public interface a {
        void a(@NotNull ICardPlayerContext iCardPlayerContext, int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/f$b.class */
    public interface b {
        void a(@NotNull ICardPlayerContext iCardPlayerContext, int i7);

        void b(boolean z6, @Nullable Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/f$c.class */
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IInlineCard<?> f70935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f f70936b;

        public c(IInlineCard<?> iInlineCard, f fVar) {
            this.f70935a = iInlineCard;
            this.f70936b = fVar;
        }

        @Override // com.bilibili.ogv.operation2.inlinevideo.f.a
        public void a(ICardPlayerContext iCardPlayerContext, int i7) {
            int repeatCount = this.f70935a.getCardData().getInlineBehavior().getRepeatCount();
            boolean releaseOnEnd = this.f70935a.getCardData().getInlineBehavior().getReleaseOnEnd();
            if (repeatCount == -1) {
                iCardPlayerContext.seekTo(this.f70936b.e());
                iCardPlayerContext.resume();
                return;
            }
            if (repeatCount < this.f70936b.getPlayCount() || !releaseOnEnd) {
                if (repeatCount < this.f70936b.getPlayCount()) {
                    iCardPlayerContext.seekTo(this.f70936b.e());
                    iCardPlayerContext.resume();
                    return;
                }
                return;
            }
            IInlineControl control = this.f70936b.getControl();
            if (control != null) {
                control.stopPlay(this.f70936b.getCard());
            }
        }
    }

    public f(@NotNull IInlineCard<?> iInlineCard, @Nullable b bVar, @Nullable a aVar) {
        super(iInlineCard, (IInlineControl) null);
        this.f70931e = bVar;
        this.f70932f = aVar;
        this.f70934i = new c(iInlineCard, this);
    }

    public /* synthetic */ f(IInlineCard iInlineCard, b bVar, a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(iInlineCard, bVar, (i7 & 4) != 0 ? null : aVar);
    }

    public final int d() {
        return this.f70933g;
    }

    public final long e() {
        return this.h;
    }

    public final void f(int i7) {
        this.f70933g = i7;
    }

    public final void g(long j7) {
        this.h = j7;
    }

    public void onCompleted(@NotNull ICardPlayerContext iCardPlayerContext) {
        super.onCompleted(iCardPlayerContext);
        b bVar = this.f70931e;
        if (bVar != null) {
            bVar.a(iCardPlayerContext, this.f70933g);
        }
        a aVar = this.f70932f;
        if (aVar != null) {
            aVar.a(iCardPlayerContext, this.f70933g);
        } else {
            this.f70934i.a(iCardPlayerContext, this.f70933g);
        }
    }

    public void onInfo(int i7, @Nullable Object obj) {
        super.onInfo(i7, obj);
        if (i7 != 1) {
            if (i7 == 2) {
                b bVar = this.f70931e;
                if (bVar != null) {
                    bVar.b(true, obj);
                    return;
                }
                return;
            }
            if (i7 != 3) {
                return;
            }
        }
        b bVar2 = this.f70931e;
        if (bVar2 != null) {
            bVar2.b(false, obj);
        }
    }
}
