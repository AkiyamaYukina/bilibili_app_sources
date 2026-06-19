package com.bilibili.playerbizcommon.widget.function.seek;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C3237a;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.InnerInsulateImageView;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.DraggingProgressObserver;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.T;
import tv.danmaku.biliplayerv2.service.ThumbnailLoader;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.utils.TimeFormater;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/seek/SeekThumbnailFunctionWidget.class */
public final class SeekThumbnailFunctionWidget extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f80683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f80685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BiliImageView f80686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f80687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f80688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f80689g;
    public PlayerContainer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ThumbnailLoader f80690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f80691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f80692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f80693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<SeekService> f80694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Rect f80695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f80697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final b f80698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f80699r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/seek/SeekThumbnailFunctionWidget$Configuration.class */
    public static final class Configuration extends AbsFunctionWidget.Configuration {

        @NotNull
        public static final a Companion = new Object();
        public static final int TYPE_SHOW_THUMBNAIL = 1;
        public static final int TYPE_SHOW_TIPS = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public ThumbnailLoader f80700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f80702c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f80701b = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public Rect f80703d = new Rect(0, 0, 0, 0);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/seek/SeekThumbnailFunctionWidget$Configuration$a.class */
        public static final class a {
        }

        public final boolean getInUnSeekRegion() {
            return this.f80702c;
        }

        @NotNull
        public final Rect getSeekBounds() {
            return this.f80703d;
        }

        @Nullable
        public final ThumbnailLoader getThumbnailFetcher() {
            return this.f80700a;
        }

        public final int getType() {
            return this.f80701b;
        }

        public final void setInUnSeekRegion(boolean z6) {
            this.f80702c = z6;
        }

        public final void setSeekBounds(@NotNull Rect rect) {
            this.f80703d = rect;
        }

        public final void setThumbnailFetcher(@Nullable ThumbnailLoader thumbnailLoader) {
            this.f80700a = thumbnailLoader;
        }

        public final void setType(int i7) {
            this.f80701b = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/seek/SeekThumbnailFunctionWidget$a.class */
    public static final class a implements DraggingProgressObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeekThumbnailFunctionWidget f80704a;

        public a(SeekThumbnailFunctionWidget seekThumbnailFunctionWidget) {
            this.f80704a = seekThumbnailFunctionWidget;
        }

        public static String b(int i7) {
            return i7 >= 0 ? TimeFormater.INSTANCE.formatTime(i7, false, false) : "00:00";
        }

        public final void a() {
            SeekThumbnailFunctionWidget seekThumbnailFunctionWidget = this.f80704a;
            IPlayerContainer iPlayerContainer = seekThumbnailFunctionWidget.h;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (iPlayerContainer2.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                TextView textView = seekThumbnailFunctionWidget.f80688f;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView2 = null;
                }
                textView2.setScaleX(1.0f);
                TextView textView3 = seekThumbnailFunctionWidget.f80688f;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView3 = null;
                }
                textView3.setScaleY(1.0f);
                return;
            }
            TextView textView4 = seekThumbnailFunctionWidget.f80688f;
            TextView textView5 = textView4;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                textView5 = null;
            }
            textView5.setScaleX(0.8f);
            TextView textView6 = seekThumbnailFunctionWidget.f80688f;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                textView6 = null;
            }
            textView6.setScaleY(0.8f);
        }

        public final void c(int i7, int i8, String str, boolean z6) {
            String strB = b(i7);
            String strB2 = b(i8);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{strB, strB2}, 2));
            String strA = str2;
            if (z6) {
                strA = B0.a.a(str2, " · ", str);
            }
            TextView textView = this.f80704a.f80688f;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                textView2 = null;
            }
            textView2.setText(strA);
        }

        public final void onDraggingByUserChanged(boolean z6) {
            if (z6) {
                SeekThumbnailFunctionWidget seekThumbnailFunctionWidget = this.f80704a;
                IPlayerContainer iPlayerContainer = seekThumbnailFunctionWidget.h;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                seekThumbnailFunctionWidget.f80696o = iPlayerContainer2.getPlayerCoreService().getCurrentPosition();
            }
        }

        public final void onDraggingProgressChanged(int i7, int i8) {
            String strB;
            SeekThumbnailFunctionWidget seekThumbnailFunctionWidget = this.f80704a;
            IPlayerContainer iPlayerContainer = seekThumbnailFunctionWidget.h;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            if (!iPlayerContainer2.getControlContainerService().isShowing()) {
                IPlayerContainer iPlayerContainer3 = seekThumbnailFunctionWidget.h;
                IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
                if (iPlayerContainer3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer4 = null;
                }
                iPlayerContainer4.getControlContainerService().show();
            }
            int i9 = i7 - seekThumbnailFunctionWidget.f80696o;
            if (i9 == 0 && i7 != i8 && i7 != 0) {
                seekThumbnailFunctionWidget.f80697p = i9;
                return;
            }
            seekThumbnailFunctionWidget.f80696o = i7;
            IPlayerContainer iPlayerContainer5 = seekThumbnailFunctionWidget.h;
            IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
            if (iPlayerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer6 = null;
            }
            ChronosThumbnailInfo.WatchPoint watchPointFindWatchPointByPosition = iPlayerContainer6.getInteractLayerService().findWatchPointByPosition(i7);
            String content = watchPointFindWatchPointByPosition != null ? watchPointFindWatchPointByPosition.getContent() : null;
            boolean z6 = content != null && (StringsKt.isBlank(content) ^ true);
            if (seekThumbnailFunctionWidget.f80691j != 1 || seekThumbnailFunctionWidget.f80692k) {
                ViewGroup viewGroup = seekThumbnailFunctionWidget.f80683a;
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                    viewGroup2 = null;
                }
                if (viewGroup2.getVisibility() == 0) {
                    ViewGroup viewGroup3 = seekThumbnailFunctionWidget.f80683a;
                    ViewGroup viewGroup4 = viewGroup3;
                    if (viewGroup3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                        viewGroup4 = null;
                    }
                    viewGroup4.setVisibility(8);
                }
                TextView textView = seekThumbnailFunctionWidget.f80688f;
                TextView textView2 = textView;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView2 = null;
                }
                if (textView2.getVisibility() != 0) {
                    TextView textView3 = seekThumbnailFunctionWidget.f80688f;
                    TextView textView4 = textView3;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                        textView4 = null;
                    }
                    textView4.setVisibility(0);
                }
                a();
                if (seekThumbnailFunctionWidget.f80692k) {
                    TextView textView5 = seekThumbnailFunctionWidget.f80688f;
                    TextView textView6 = textView5;
                    if (textView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                        textView6 = null;
                    }
                    textView6.setText(seekThumbnailFunctionWidget.getMContext().getResources().getString(2131846983));
                    if (!seekThumbnailFunctionWidget.f80693l) {
                        IPlayerContainer iPlayerContainer7 = seekThumbnailFunctionWidget.h;
                        if (iPlayerContainer7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                            iPlayerContainer7 = null;
                        }
                        iPlayerContainer7.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.cancel-seek.show.player", new String[0]));
                        seekThumbnailFunctionWidget.f80693l = true;
                    }
                } else {
                    c(i7, i8, content, z6);
                }
            } else {
                ViewGroup viewGroup5 = seekThumbnailFunctionWidget.f80683a;
                ViewGroup viewGroup6 = viewGroup5;
                if (viewGroup5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                    viewGroup6 = null;
                }
                if (viewGroup6.getVisibility() != 0) {
                    ViewGroup viewGroup7 = seekThumbnailFunctionWidget.f80683a;
                    ViewGroup viewGroup8 = viewGroup7;
                    if (viewGroup7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                        viewGroup8 = null;
                    }
                    viewGroup8.setVisibility(0);
                }
                ThumbnailLoader thumbnailLoader = seekThumbnailFunctionWidget.f80690i;
                if (thumbnailLoader != null) {
                    ThumbnailLoader.fetch$default(thumbnailLoader, i7 / 1000, i8, false, 4, (Object) null);
                }
                ViewGroup viewGroup9 = seekThumbnailFunctionWidget.f80685c;
                ViewGroup viewGroup10 = viewGroup9;
                if (viewGroup9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mThumbContainer");
                    viewGroup10 = null;
                }
                if (viewGroup10.getVisibility() == 0) {
                    TextView textView7 = seekThumbnailFunctionWidget.f80687e;
                    TextView textView8 = textView7;
                    if (textView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvMessage");
                        textView8 = null;
                    }
                    IPlayerContainer iPlayerContainer8 = seekThumbnailFunctionWidget.h;
                    IPlayerContainer iPlayerContainer9 = iPlayerContainer8;
                    if (iPlayerContainer8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                        iPlayerContainer9 = null;
                    }
                    if (iPlayerContainer9.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                        InnerInsulateImageView innerInsulateImageView = seekThumbnailFunctionWidget.f80686d;
                        InnerInsulateImageView innerInsulateImageView2 = innerInsulateImageView;
                        if (innerInsulateImageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSeekDirectionImage");
                            innerInsulateImageView2 = null;
                        }
                        innerInsulateImageView2.setVisibility(0);
                        if ((i9 < 0 && seekThumbnailFunctionWidget.f80697p >= 0) || (i9 > 0 && seekThumbnailFunctionWidget.f80697p <= 0)) {
                            if (i9 > 0) {
                                ImageView imageView = seekThumbnailFunctionWidget.f80686d;
                                ImageView imageView2 = imageView;
                                if (imageView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mSeekDirectionImage");
                                    imageView2 = null;
                                }
                                imageView2.setRotation(0.0f);
                            } else {
                                ImageView imageView3 = seekThumbnailFunctionWidget.f80686d;
                                ImageView imageView4 = imageView3;
                                if (imageView3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mSeekDirectionImage");
                                    imageView4 = null;
                                }
                                imageView4.setRotation(180.0f);
                            }
                        }
                        if (i8 >= 36000000) {
                            strB = b(i7);
                        } else {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            strB = String.format("%s/%s", Arrays.copyOf(new Object[]{b(i7), b(i8)}, 2));
                        }
                    } else {
                        InnerInsulateImageView innerInsulateImageView3 = seekThumbnailFunctionWidget.f80686d;
                        InnerInsulateImageView innerInsulateImageView4 = innerInsulateImageView3;
                        if (innerInsulateImageView3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSeekDirectionImage");
                            innerInsulateImageView4 = null;
                        }
                        innerInsulateImageView4.setVisibility(8);
                        strB = b(i7);
                    }
                    textView8.setText(strB);
                }
                if (z6) {
                    TextView textView9 = seekThumbnailFunctionWidget.f80689g;
                    TextView textView10 = textView9;
                    if (textView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvHighEnergeticDesc");
                        textView10 = null;
                    }
                    textView10.setVisibility(0);
                    textView10.setText(content);
                } else {
                    TextView textView11 = seekThumbnailFunctionWidget.f80689g;
                    TextView textView12 = textView11;
                    if (textView11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mTvHighEnergeticDesc");
                        textView12 = null;
                    }
                    textView12.setVisibility(8);
                }
                TextView textView13 = seekThumbnailFunctionWidget.f80688f;
                TextView textView14 = textView13;
                if (textView13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView14 = null;
                }
                if (textView14.getVisibility() == 0) {
                    a();
                    c(i7, i8, null, false);
                }
                ViewGroup viewGroup11 = seekThumbnailFunctionWidget.f80683a;
                ViewGroup viewGroup12 = viewGroup11;
                if (viewGroup11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                    viewGroup12 = null;
                }
                int width = viewGroup12.getWidth();
                int iWidth = seekThumbnailFunctionWidget.f80695n.width();
                ViewGroup viewGroup13 = seekThumbnailFunctionWidget.f80683a;
                ViewGroup viewGroup14 = viewGroup13;
                if (viewGroup13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                    viewGroup14 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup14.getLayoutParams();
                IPlayerContainer iPlayerContainer10 = seekThumbnailFunctionWidget.h;
                IPlayerContainer iPlayerContainer11 = iPlayerContainer10;
                if (iPlayerContainer10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer11 = null;
                }
                marginLayoutParams.bottomMargin = iPlayerContainer11.getFunctionWidgetService().getAvailableHeight() - seekThumbnailFunctionWidget.f80695n.top;
                IPlayerContainer iPlayerContainer12 = seekThumbnailFunctionWidget.h;
                IPlayerContainer iPlayerContainer13 = iPlayerContainer12;
                if (iPlayerContainer12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer13 = null;
                }
                if (iPlayerContainer13.getControlContainerService().getScreenModeType() != ScreenModeType.VERTICAL_FULLSCREEN) {
                    float f7 = i7 / i8;
                    marginLayoutParams.leftMargin = (int) (((iWidth * f7) + seekThumbnailFunctionWidget.f80695n.left) - (width * f7));
                } else if (width > iWidth) {
                    marginLayoutParams.leftMargin = seekThumbnailFunctionWidget.f80695n.left - ((width - iWidth) / 2);
                } else {
                    marginLayoutParams.leftMargin = C3237a.a(iWidth, width, 2, seekThumbnailFunctionWidget.f80695n.left);
                }
                ViewGroup viewGroup15 = seekThumbnailFunctionWidget.f80683a;
                if (viewGroup15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
                    viewGroup15 = null;
                }
                viewGroup15.requestLayout();
            }
            seekThumbnailFunctionWidget.f80697p = i9;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/seek/SeekThumbnailFunctionWidget$b.class */
    public static final class b implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SeekThumbnailFunctionWidget f80705a;

        public b(SeekThumbnailFunctionWidget seekThumbnailFunctionWidget) {
            this.f80705a = seekThumbnailFunctionWidget;
        }

        public final void a(String str, boolean z6) {
        }

        public final void onFailed() {
            SeekThumbnailFunctionWidget seekThumbnailFunctionWidget = this.f80705a;
            if (seekThumbnailFunctionWidget.isShowing() && seekThumbnailFunctionWidget.f80691j == 1) {
                ImageView imageView = seekThumbnailFunctionWidget.f80684b;
                ImageView imageView2 = imageView;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mIvThumb");
                    imageView2 = null;
                }
                imageView2.setImageBitmap(null);
                ViewGroup viewGroup = seekThumbnailFunctionWidget.f80685c;
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mThumbContainer");
                    viewGroup2 = null;
                }
                viewGroup2.setVisibility(8);
                TextView textView = seekThumbnailFunctionWidget.f80688f;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView = null;
                }
                textView.setVisibility(0);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onResult(android.graphics.Bitmap r5) {
            /*
                Method dump skipped, instruction units count: 597
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.function.seek.SeekThumbnailFunctionWidget.b.onResult(android.graphics.Bitmap):void");
        }
    }

    public SeekThumbnailFunctionWidget(@NotNull Context context) {
        super(context);
        this.f80691j = 2;
        this.f80694m = new PlayerServiceManager.Client<>();
        this.f80695n = new Rect(0, 0, 0, 0);
        this.f80698q = new b(this);
        this.f80699r = new a(this);
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.h = playerContainer;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        Video.DisplayParams displayParams;
        View viewInflate = LayoutInflater.from(context).inflate(2131495191, (ViewGroup) null);
        this.f80688f = (TextView) viewInflate.findViewById(2131315382);
        this.f80683a = (ViewGroup) viewInflate.findViewById(2131305603);
        this.f80685c = (ViewGroup) viewInflate.findViewById(2131310444);
        ViewGroup viewGroup = this.f80683a;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
            viewGroup2 = null;
        }
        this.f80684b = (ImageView) viewGroup2.findViewById(2131313251);
        BiliImageView biliImageViewFindViewById = viewInflate.findViewById(2131311051);
        this.f80686d = biliImageViewFindViewById;
        BiliImageView biliImageView = biliImageViewFindViewById;
        if (biliImageViewFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekDirectionImage");
            biliImageView = null;
        }
        biliImageView.setImageResource(2131238478);
        IPlayerContainer iPlayerContainer = this.h;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayerContainer2.getVideoPlayDirectorService().getCurrentPlayableParams();
        Float fValueOf = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? null : Float.valueOf(displayParams.getDisplayRotate());
        if (fValueOf != null && fValueOf.floatValue() > 1.0f) {
            ImageView imageView = this.f80684b;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvThumb");
                imageView2 = null;
            }
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            int iDp2px = (int) DpUtils.dp2px(BiliContext.application(), 56.0f);
            layoutParams.width = iDp2px;
            layoutParams.height = (int) (fValueOf.floatValue() * iDp2px);
        }
        ViewGroup viewGroup3 = this.f80683a;
        ViewGroup viewGroup4 = viewGroup3;
        if (viewGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
            viewGroup4 = null;
        }
        this.f80687e = (TextView) viewGroup4.findViewById(2131304642);
        ViewGroup viewGroup5 = this.f80683a;
        if (viewGroup5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfoContainer");
            viewGroup5 = null;
        }
        this.f80689g = (TextView) viewGroup5.findViewById(2131314488);
        return viewInflate;
    }

    @NotNull
    public FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().dismissWhenActivityStop(true).dismissWhenScreenModeChange(true).dismissWhenVideoCompleted(true).persistent(true).build();
    }

    @NotNull
    public String getTag() {
        return "SeekThumbnailFunctionWidget";
    }

    public void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if (configuration instanceof Configuration) {
            Configuration configuration2 = (Configuration) configuration;
            this.f80690i = configuration2.getThumbnailFetcher();
            this.f80691j = configuration2.getType();
            this.f80695n.set(configuration2.getSeekBounds());
            if (!this.f80692k && configuration2.getInUnSeekRegion()) {
                this.f80693l = false;
            }
            this.f80692k = configuration2.getInUnSeekRegion();
            TextView textView = null;
            if (this.f80691j != 1) {
                TextView textView2 = this.f80688f;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
                    textView2 = null;
                }
                textView2.setVisibility(0);
                return;
            }
            TextView textView3 = this.f80688f;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTvTips");
            } else {
                textView = textView3;
            }
            textView.setVisibility(8);
            ThumbnailLoader thumbnailLoader = this.f80690i;
            if (thumbnailLoader != null) {
                thumbnailLoader.setResponseCallback(this.f80698q);
            }
        }
    }

    public void onRelease() {
        this.f80690i = null;
    }

    public void onWidgetDismiss() {
        super.onWidgetDismiss();
        ImageView imageView = this.f80684b;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIvThumb");
            imageView2 = null;
        }
        imageView2.setImageBitmap(null);
        PlayerServiceManager.Client<SeekService> client = this.f80694m;
        SeekService service = client.getService();
        if (service != null) {
            service.unregisterDraggingProgress(this.f80699r);
        }
        IPlayerContainer iPlayerContainer = this.h;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer = null;
        }
        iPlayerContainer.getPlayerServiceManager().unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class), client);
        this.f80692k = false;
    }

    public void onWidgetShow() {
        super.onWidgetShow();
        IPlayerContainer iPlayerContainer = this.h;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        this.f80696o = iPlayerContainer2.getPlayerCoreService().getCurrentPosition();
        IPlayerContainer iPlayerContainer3 = this.h;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer3 = null;
        }
        IPlayerServiceManager playerServiceManager = iPlayerContainer3.getPlayerServiceManager();
        PlayerServiceManager.ServiceDescriptor serviceDescriptorObtain = PlayerServiceManager.ServiceDescriptor.Companion.obtain(SeekService.class);
        PlayerServiceManager.Client<SeekService> client = this.f80694m;
        playerServiceManager.bindService(serviceDescriptorObtain, client);
        SeekService service = client.getService();
        if (service != null) {
            service.registerDraggingProgress(this.f80699r);
        }
        this.f80692k = false;
    }
}
