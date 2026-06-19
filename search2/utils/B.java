package com.bilibili.search2.utils;

import Bl.v0;
import Ps0.C2784e;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.SearchRecentSuggestions;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.node.C4448z;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.math.MathUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import bilibili.live.app.service.constant.CardTypeKt;
import com.bilibili.app.comm.list.common.inline.config.search.SearchAutoPlayUtilsKt;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.comm.list.common.utils.UriSafeKt;
import com.bilibili.app.comm.list.widget.image.IUrlGetter;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.base.IImageTag;
import com.bilibili.app.comm.list.widget.tag.tagtinttext.TagSpanTextView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.InternalScreenAdjustDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.bililive.listplayer.videonew.player.InlineLivePlayableParams;
import com.bilibili.inline.card.PlayReason;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.IPlayerPreloadRouteService;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.inline.Option;
import com.bilibili.search2.inline.TrafficConfig;
import com.bilibili.search2.main.BiliMainSearchActivityForInnerJump;
import com.bilibili.search2.provider.BiliSearchSuggestionProvider;
import com.bilibili.search2.result.holder.author.InlineSettingBottomDialog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/B.class */
@JvmName(name = "SearchUtils")
public final class B {
    public static final void A(@NotNull TextView textView, @Nullable CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v57, types: [androidx.fragment.app.DialogFragment] */
    public static void B(Fragment fragment, TrafficConfig trafficConfig, Function1 function1, Function0 function0) {
        final FragmentActivity fragmentActivityP3;
        LifecycleCoroutineScope lifecycleScope;
        if (fragment != null) {
            Context context = fragment.getContext();
            InlineSettingBottomDialog inlineSettingBottomDialog = null;
            if (context != null ? com.bilibili.search2.component.e.g(context) : false) {
                o(trafficConfig, fragment.getContext());
                final p pVar = new p(fragment, trafficConfig, function1, null, null);
                Fragment fragment2 = pVar.f88841a;
                if (fragment2 == null || (fragmentActivityP3 = fragment2.p3()) == null) {
                    return;
                }
                ComposeView composeView = new ComposeView(fragmentActivityP3, null, 0, 6, null);
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1500833243, true, new Function2(pVar, fragmentActivityP3) { // from class: com.bilibili.search2.utils.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final p f88839a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final FragmentActivity f88840b;

                    {
                        this.f88839a = pVar;
                        this.f88840b = fragmentActivityP3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                        /*
                            Method dump skipped, instruction units count: 206
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.o.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }));
                new InternalScreenAdjustDialog(fragmentActivityP3, composeView, G.b.a, "", 0.5f, 0, true, true, false, 3, a.b.a, pVar.f88846f, R$color.f64616Wh0, true).show();
                LifecycleOwner lifecycleOwner = BiliCallLifeCycleObserverKt.getLifecycleOwner(fragmentActivityP3);
                if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    return;
                }
                BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new SearchInlineBottomCompatDialog$show$1$2(fragmentActivityP3, pVar, null), 3, (Object) null);
                return;
            }
            Object objFindFragmentByTag = fragment.getChildFragmentManager().findFragmentByTag("search_option");
            if (objFindFragmentByTag instanceof InlineSettingBottomDialog) {
                inlineSettingBottomDialog = (InlineSettingBottomDialog) objFindFragmentByTag;
            }
            InlineSettingBottomDialog inlineSettingBottomDialog2 = inlineSettingBottomDialog;
            if (inlineSettingBottomDialog == null) {
                inlineSettingBottomDialog2 = new InlineSettingBottomDialog();
            }
            o(trafficConfig, fragment.getContext());
            inlineSettingBottomDialog2.f87813g = function1;
            inlineSettingBottomDialog2.h = function0;
            inlineSettingBottomDialog2.f87814i = true;
            if (inlineSettingBottomDialog2.isAdded()) {
                Dialog dialog = inlineSettingBottomDialog2.getDialog();
                if (dialog != null) {
                    dialog.show();
                }
            } else {
                inlineSettingBottomDialog2.showNow(fragment.getChildFragmentManager(), "search_option");
            }
            List<Option> options = trafficConfig.getOptions();
            if (options == null) {
                return;
            }
            inlineSettingBottomDialog2.f87815j = options;
            String title = trafficConfig.getTitle();
            if (title == null || StringsKt.isBlank(title)) {
                TextView textView = inlineSettingBottomDialog2.f87809c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                View view = inlineSettingBottomDialog2.f87810d;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                TextView textView2 = inlineSettingBottomDialog2.f87809c;
                if (textView2 != null) {
                    textView2.setText(trafficConfig.getTitle());
                }
            }
            LinearLayout linearLayout = inlineSettingBottomDialog2.f87811e;
            if (linearLayout != null) {
                CommonDialogUtilsKt.setVisibility(linearLayout, false);
            }
            LinearLayout linearLayout2 = inlineSettingBottomDialog2.f87811e;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            }
            inlineSettingBottomDialog2.getContext();
            com.bilibili.search2.result.holder.author.o oVar = inlineSettingBottomDialog2.f87812f;
            if (oVar != null) {
                oVar.f87887b = inlineSettingBottomDialog2.f87815j;
                oVar.notifyDataSetChanged();
            }
        }
    }

    public static final int C(float f7) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return (int) ((f7 * (displayMetrics != null ? displayMetrics.density : 2.0f)) + 0.5f);
    }

    public static final void D(int i7, @NotNull View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.matchConstraintMaxWidth = i7;
        view.setLayoutParams(layoutParams2);
    }

    public static final void a(@Nullable String str, @NotNull Video.PlayableParams playableParams, @NotNull PlayReason playReason, @Nullable String str2) {
        int i7 = playReason == PlayReason.INLINE_AUTO_PLAY ? 99 : 0;
        if (str != null && !StringsKt.isBlank(str)) {
            playableParams.setFlashJsonStr(UriSafeKt.safetyQueryParameter(Uri.parse(str), "player_preload"));
        }
        playableParams.setJumpFrom("3");
        playableParams.setShareJumpFrom("3");
        playableParams.setSpmid("search.search-result.0.0");
        playableParams.setFromSpmid("search.search-result.0.0");
        playableParams.setFromAutoPlay(i7);
        playableParams.setTrackId(str2);
        IPlayerPreloadRouteService iPlayerPreloadRouteService = (IPlayerPreloadRouteService) BLRouter.INSTANCE.get(IPlayerPreloadRouteService.class, "player_preload");
        if (iPlayerPreloadRouteService != null) {
            playableParams.setFnVal(iPlayerPreloadRouteService.getFnVal());
            playableParams.setFnVer(iPlayerPreloadRouteService.getFnVer());
        }
    }

    public static final void b(@NotNull InlineLivePlayableParams inlineLivePlayableParams, long j7, @Nullable String str, @Nullable Boolean bool) {
        inlineLivePlayableParams.setShowDanmaku(!Intrinsics.areEqual(bool, Boolean.TRUE));
        inlineLivePlayableParams.setRoomId(j7);
        inlineLivePlayableParams.setJumpFrom("3");
        inlineLivePlayableParams.setSpmid("search.search-result.0.0");
        inlineLivePlayableParams.setFromSpmid("search.search-result.0.0");
        inlineLivePlayableParams.setLink(str);
        inlineLivePlayableParams.setBusiness("search");
        inlineLivePlayableParams.setLiveScene(CardTypeKt.getCARD_TYPE_SEARCH_LIVE_CARD_INLINE());
    }

    public static final void c(@Nullable View view, @Nullable C2784e c2784e) {
        String text;
        if (view == null || c2784e == null || (text = c2784e.getText()) == null || StringsKt.isBlank(text)) {
            if (view != null) {
                ListExtentionsKt.gone(view);
                return;
            }
            return;
        }
        try {
            ListExtentionsKt.visible(view);
            BiliImageView biliImageViewFindViewById = view.findViewById(2131304125);
            TintTextView tintTextView = (TintTextView) view.findViewById(2131314285);
            boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(view.getContext());
            if (biliImageViewFindViewById != null) {
                String str = c2784e.f19185b;
                String str2 = c2784e.f19184a;
                biliImageViewFindViewById.setVisibility(ListExtentionsKt.toVisibility((str2 == null || StringsKt.isBlank(str2) || str == null || StringsKt.isBlank(str)) ? false : true));
                if (zIsNightTheme) {
                    str2 = str;
                }
                com.bilibili.search2.utils.extension.c.a(biliImageViewFindViewById, str2, null, false, null, null, 0, 0, 254);
            }
            if (tintTextView != null) {
                w(tintTextView, (biliImageViewFindViewById == null || biliImageViewFindViewById.getVisibility() != 0) ? ListExtentionsKt.toPx(2) : 0);
            }
            if (tintTextView != null) {
                tintTextView.setText(c2784e.getText());
                tintTextView.setTextColor(Color.parseColor(zIsNightTheme ? c2784e.getTextColorNight() : c2784e.getTextColor()));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(ListExtentionsKt.toPx(0.5d), Color.parseColor(zIsNightTheme ? c2784e.getBorderColorNight() : c2784e.getBorderColor()));
            gradientDrawable.setCornerRadius(ListExtentionsKt.toPx(2));
            view.setBackground(gradientDrawable);
        } catch (Exception e7) {
            ListExtentionsKt.gone(view);
            M.b("bind charge label error:", e7.getMessage(), "Bind charge label");
        }
    }

    public static final void d(@Nullable final com.bilibili.search2.api.b bVar, @NotNull v0 v0Var, @NotNull final Context context, @NotNull final BaseSearchItem baseSearchItem) {
        Unit unit;
        String text;
        if (bVar != null) {
            ListExtentionsKt.visible(v0Var.a);
            v0Var.a.setOnClickListener(new View.OnClickListener(bVar, context, baseSearchItem) { // from class: com.bilibili.search2.utils.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.bilibili.search2.api.b f88870a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Context f88871b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final BaseSearchItem f88872c;

                {
                    this.f88870a = bVar;
                    this.f88871b = context;
                    this.f88872c = baseSearchItem;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String jumpUrl;
                    com.bilibili.search2.api.b bVar2 = this.f88870a;
                    Context context2 = this.f88871b;
                    BaseSearchItem baseSearchItem2 = this.f88872c;
                    SearchBangumiItem.PurchaseButton purchaseButton = bVar2.f86298f;
                    if (purchaseButton == null || (jumpUrl = purchaseButton.getJumpUrl()) == null) {
                        return;
                    }
                    Os0.e.g(Os0.e.f18030a, context2, jumpUrl);
                    String linkType = baseSearchItem2.getLinkType();
                    String strD = Xs0.b.d(baseSearchItem2, "extra-link", null, 2);
                    HashMap map = new HashMap();
                    map.put("vip_status", bVar2.f86299g);
                    map.put("vip_type", bVar2.h);
                    map.put("tips_id", bVar2.f86300i);
                    map.put("page_num", String.valueOf(baseSearchItem2.getPageNum()));
                    map.put("server_page_pos", String.valueOf(baseSearchItem2.getServerPagePos()));
                    map.put("page_pos", String.valueOf(baseSearchItem2.getLocalPagePos()));
                    Xs0.b.i("search.search-result.search-card.all.click", null, linkType, baseSearchItem2, null, null, strD, null, null, map, false, null, 7088);
                }
            });
            TintTextView tintTextView = v0Var.f;
            String str = bVar.f86295c;
            if (str != null) {
                tintTextView.setText(str);
            } else {
                ListExtentionsKt.gone(tintTextView);
            }
            TintTextView tintTextView2 = v0Var.e;
            SearchBangumiItem.PurchaseButton purchaseButton = bVar.f86298f;
            if (purchaseButton == null || (text = purchaseButton.getText()) == null) {
                ListExtentionsKt.gone(tintTextView2);
            } else {
                tintTextView2.setText(text);
            }
            h(v0Var.d, bVar.f86296d);
            TintTextView tintTextView3 = v0Var.c;
            String str2 = bVar.f86297e;
            if (str2 != null) {
                tintTextView3.setText(str2);
            } else {
                ListExtentionsKt.gone(tintTextView3);
            }
            boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(context);
            ListPlaceHolderImageView listPlaceHolderImageView = v0Var.b;
            if (zIsNightTheme) {
                String str3 = bVar.f86294b;
                unit = null;
                if (str3 != null) {
                    com.bilibili.search2.utils.extension.c.a(listPlaceHolderImageView, str3, null, false, null, null, 0, 0, 254);
                    unit = Unit.INSTANCE;
                }
            } else {
                String str4 = bVar.f86293a;
                unit = null;
                if (str4 != null) {
                    com.bilibili.search2.utils.extension.c.a(listPlaceHolderImageView, str4, null, false, null, null, 0, 0, 254);
                    unit = Unit.INSTANCE;
                }
            }
            if (unit != null) {
                return;
            }
        }
        ListExtentionsKt.gone(v0Var.a);
    }

    @NotNull
    public static final CharSequence e(int i7, @NotNull TextView textView, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        int i8;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return charSequence;
        }
        if (i7 <= 0 || layout.getLineCount() <= i7) {
            return charSequence;
        }
        int i9 = i7 - 1;
        int lineStart = layout.getLineStart(i9);
        int lineEnd = layout.getLineEnd(i9);
        TextPaint paint = textView.getPaint();
        SpannableString spannableString = (SpannableString) charSequence2;
        float desiredWidth = spannableString.length() <= 1 ? Layout.getDesiredWidth("  ", 0, 2, paint) : Layout.getDesiredWidth(charSequence2, 0, spannableString.length(), paint);
        int iClamp = MathUtils.clamp(lineEnd, 0, charSequence.length());
        do {
            i8 = iClamp - 1;
            if (i8 < lineStart) {
                break;
            }
            iClamp = i8;
        } while (layout.getWidth() - Layout.getDesiredWidth(charSequence, lineStart, i8, paint) < desiredWidth);
        return new SpannableStringBuilder(charSequence.subSequence(0, MathUtils.clamp(i8, 0, charSequence.length()))).append(charSequence2);
    }

    public static final void f(@NotNull View view, @NotNull Function0<Unit> function0) {
        view.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.o(function0, 1));
    }

    public static void g(BiliImageView biliImageView, String str, Integer num, int i7, int i8, int i9, int i10) {
        float px = ListExtentionsKt.toPx(4.0f);
        if ((i10 & 32) != 0) {
            i9 = 0;
        }
        if ((str == null || StringsKt.isBlank(str)) && i9 == 0) {
            ImageRequestBuilder.placeholderImageResId$default(X9.n.a(biliImageView, BiliImageLoader.INSTANCE, (String) null), 2131237005, (ScaleType) null, 2, (Object) null).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null)).into(biliImageView);
            return;
        }
        ImageRequestBuilder imageRequestBuilderA = X9.n.a(biliImageView, BiliImageLoader.INSTANCE, str);
        if (i9 != 0) {
            ImageRequestBuilder.failureImageResId$default(imageRequestBuilderA.placeholderImageResId(i9, ScaleType.CENTER_INSIDE), i9, (ScaleType) null, 2, (Object) null);
        }
        imageRequestBuilderA.thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("search-normal-fill-android", (IThumbnailSizeController) null, 2, (Object) null));
        RoundingParams roundingParams = biliImageView.getGenericProperties().getRoundingParams();
        RoundingParams roundingParams2 = roundingParams;
        if (roundingParams == null) {
            roundingParams2 = new RoundingParams();
        }
        if (num.intValue() == 1) {
            roundingParams2.setRoundAsCircle(false);
            roundingParams2.setCornersRadius(px);
            biliImageView.setAspectRatio(1.0f);
        } else if (num.intValue() == 2) {
            roundingParams2.setRoundAsCircle(false);
            roundingParams2.setCornersRadius(px);
            biliImageView.setAspectRatio(0.75f);
        } else if (num.intValue() == 4) {
            roundingParams2.setRoundAsCircle(false);
            roundingParams2.setCornersRadius(px);
            biliImageView.setAspectRatio(1.0f);
        } else {
            roundingParams2.setRoundAsCircle(true);
            biliImageView.setAspectRatio(1.0f);
        }
        if (i8 > 0 && i7 > 0) {
            roundingParams2.setBorderId(biliImageView.getContext(), i8, i7);
            roundingParams2.setScaleDownInsideBorders(true);
        }
        imageRequestBuilderA.roundingParams(roundingParams2).into(biliImageView);
    }

    public static void h(TagSpanTextView tagSpanTextView, Tag tag) {
        if (tag == null) {
            tagSpanTextView.setVisibility(8);
            return;
        }
        TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
        tagBuilder.setTagText(tag.getText());
        tagBuilder.setTagTextColor(tag.getTextColor());
        tagBuilder.setTagBackgroundColor(tag.getBgColor());
        tagBuilder.setTagBorderColor(tag.getBorderColor());
        tagBuilder.setTagNightTextColor(tag.getTextColorNight());
        tagBuilder.setTagNightBackgroundColor(tag.getBgColorNight());
        tagBuilder.setTagNightBorderColor(tag.getBorderColorNight());
        tagBuilder.setTagBackgroundStyle(tag.getBgStyle());
        TagSpanTextView.TagBuilder.appendTag$default(tagBuilder, false, false, 1, (Object) null);
        tagBuilder.applyToView(true);
    }

    public static void i(TagSpanTextView tagSpanTextView, Tag tag, IImageTag iImageTag, CharSequence charSequence, Function0 function0, Pair pair, boolean z6, Integer num, int i7) {
        if ((i7 & 32) != 0) {
            pair = new Pair(0, Integer.valueOf(ListExtentionsKt.toPx(6)));
        }
        if ((i7 & 64) != 0) {
            z6 = true;
        }
        if ((i7 & 1024) != 0) {
            num = null;
        }
        if (tag == null && iImageTag == null) {
            function0.invoke();
            return;
        }
        TagSpanTextView.TagBuilder tagBuilder = tagSpanTextView.tagBuilder();
        if (iImageTag != null) {
            tagBuilder.setImageIcon(iImageTag, (IUrlGetter) null, num != null ? num.intValue() : 2131232646).appendImage(((Number) pair.first).intValue(), ((Number) pair.second).intValue());
        }
        if (tag != null) {
            TagSpanTextView.TagBuilder.appendTag$default(tagBuilder.setTagText(tag.getText()).setTagTextColor(tag.getTextColor()).setTagBackgroundColor(tag.getBgColor()).setTagBorderColor(tag.getBorderColor()).setTagNightTextColor(tag.getTextColorNight()).setTagNightBackgroundColor(tag.getBgColorNight()).setTagNightBorderColor(tag.getBorderColorNight()).setTagBackgroundStyle(tag.getBgStyle()).setTagRightSpacing(ListExtentionsKt.toPx(6)), false, false, 1, (Object) null);
        }
        if (charSequence != null) {
            tagBuilder.appendText(charSequence);
        }
        tagBuilder.applyToView(z6);
    }

    public static final void j(@NotNull final View view, final int i7, final int i8, final int i9, final int i10) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            final View view3 = view2;
            view2.post(new Runnable(view, i7, i8, i9, i10, view3) { // from class: com.bilibili.search2.utils.z

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final View f88873a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f88874b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f88875c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f88876d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f88877e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final View f88878f;

                {
                    this.f88873a = view;
                    this.f88874b = i7;
                    this.f88875c = i8;
                    this.f88876d = i9;
                    this.f88877e = i10;
                    this.f88878f = view3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    View view4 = this.f88873a;
                    int i11 = this.f88874b;
                    int i12 = this.f88875c;
                    int i13 = this.f88876d;
                    int i14 = this.f88877e;
                    View view5 = this.f88878f;
                    Rect rect = new Rect();
                    view4.getHitRect(rect);
                    rect.top -= i11;
                    rect.bottom += i12;
                    rect.left -= i13;
                    rect.right += i14;
                    view5.setTouchDelegate(new TouchDelegate(rect, view4));
                }
            });
        }
    }

    @Nullable
    public static final String k(@Nullable Integer num) {
        String str;
        if (num == null) {
            str = "jump_game_detail";
        } else {
            int iIntValue = num.intValue();
            str = iIntValue != 1 ? iIntValue != 2 ? "interaction_button_click" : "interaction_download" : "interaction_reserve";
        }
        return str;
    }

    @NotNull
    public static final Map<String, String> l(@NotNull BaseSearchItem baseSearchItem) {
        return MapsKt.mutableMapOf(new kotlin.Pair[]{TuplesKt.to("query", baseSearchItem.getKeyword()), TuplesKt.to("page_num", String.valueOf(baseSearchItem.getPageNum())), TuplesKt.to("server_page_pos", String.valueOf(baseSearchItem.getServerPagePos())), TuplesKt.to("moduletype", baseSearchItem.getLinkType()), TuplesKt.to("trackid", baseSearchItem.getTrackId())});
    }

    public static mi.c m(int i7, int i8, int i9, int i10, int i11) {
        int i12 = R$color.Pi5;
        if ((i11 & 8) != 0) {
            i9 = ListExtentionsKt.toPx(70);
        }
        if ((i11 & 16) != 0) {
            i10 = ListExtentionsKt.toPx(24);
        }
        return new mi.c(i9, i10, i12, i10 / 2, ListExtentionsKt.toPx(1), true, R$color.Wh0_u, 0.0f, Integer.valueOf(i7), 0, Integer.valueOf(i8), 31360, (Integer) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String n(int r3) {
        /*
            android.app.Activity r0 = com.bilibili.base.BiliContext.topActivity()
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto Le
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r4 = r0
        Le:
            r0 = r4
            if (r0 == 0) goto L1e
            r0 = r4
            r1 = r3
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L21
        L1e:
            java.lang.String r0 = ""
            r4 = r0
        L21:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.B.n(int):java.lang.String");
    }

    public static final void o(TrafficConfig trafficConfig, Context context) {
        List<Option> options;
        if (context == null || (options = trafficConfig.getOptions()) == null) {
            return;
        }
        Rh.a aVar = Rh.a.a;
        int searchSpConfigValue = SearchAutoPlayUtilsKt.toSearchSpConfigValue(Rh.a.d(Rh.a.b()).getValue());
        for (Option option : options) {
            option.setSelected(option.getId() == searchSpConfigValue);
        }
    }

    public static final int p(int i7, @Nullable String str, @NotNull Context context) {
        try {
            i7 = str != null ? Color.parseColor(str) : context.getResources().getColor(i7);
        } catch (IllegalArgumentException e7) {
            i7 = context.getResources().getColor(i7);
        }
        return i7;
    }

    @Nullable
    public static final String q(@Nullable String str) {
        String strA = str;
        if (str != null) {
            strA = (!StringsKt.isBlank(str) && StringsKt.w(str, ">")) ? C4448z.a(1, 0, str) : str;
        }
        return strA;
    }

    public static final boolean r(@NotNull Context context, @Nullable String str) {
        Uri uriBuild;
        boolean z6 = false;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                z6 = false;
            } else {
                try {
                    if (TextUtils.isEmpty(str)) {
                        uriBuild = null;
                    } else {
                        try {
                            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                            builderBuildUpon.appendQueryParameter("from_spmid", "search.search-result.0.0");
                            builderBuildUpon.appendQueryParameter("jumpFrom", "3");
                            uriBuild = builderBuildUpon.build();
                        } catch (Exception e7) {
                            BLog.e("SearchSpmidConstants", e7);
                            uriBuild = null;
                        }
                    }
                    if (uriBuild != null) {
                        Os0.e.f(context, uriBuild);
                    }
                    z6 = true;
                } catch (NumberFormatException e8) {
                    BLog.e("author route error", e8);
                    z6 = false;
                }
            }
        }
        return z6;
    }

    @ColorInt
    public static final int s(@NotNull String str, @NotNull String str2) {
        int color;
        try {
            color = Color.parseColor(str);
        } catch (Exception e7) {
            color = Color.parseColor(str2);
        }
        return color;
    }

    public static final void t(@Nullable Context context, @Nullable String str) {
        if (str == null || StringsKt.isBlank(str) || context == null) {
            return;
        }
        BiliSearchSuggestionProvider.Companion.getClass();
        new SearchRecentSuggestions(context, BiliSearchSuggestionProvider.AUTHORITY, 1).saveRecentQuery(str, null);
    }

    public static final void u(@NotNull Context context, @NotNull String str, @Nullable FragmentActivity fragmentActivity, @Nullable String str2) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("jump_type", fragmentActivity instanceof BiliMainSearchActivityForInnerJump ? "" : "inner").appendQueryParameter("direct_return", "true");
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("from_trackid", str2);
        }
        Os0.e.f(context, builderAppendQueryParameter.build());
    }

    public static final void v(@NotNull View view, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i7);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void w(@NotNull View view, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(i7, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void x(@NotNull View view, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i7, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void y(@NotNull View view, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i7, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void z(@Nullable final View view, final long j7, @NotNull Function1<? super View, Unit> function1) {
        if (view != null) {
            final Bp0.c cVar = new Bp0.c(function1, 3);
            final Ref.LongRef longRef = new Ref.LongRef();
            view.setOnClickListener(new View.OnClickListener(longRef, j7, cVar, view) { // from class: com.bilibili.search2.utils.A

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.LongRef f88792a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f88793b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Bp0.c f88794c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final View f88795d;

                {
                    this.f88792a = longRef;
                    this.f88793b = j7;
                    this.f88794c = cVar;
                    this.f88795d = view;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ref.LongRef longRef2 = this.f88792a;
                    long j8 = this.f88793b;
                    Bp0.c cVar2 = this.f88794c;
                    View view3 = this.f88795d;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - longRef2.element < j8) {
                        return;
                    }
                    longRef2.element = jUptimeMillis;
                    cVar2.onClick(view3);
                }
            });
        }
    }
}
