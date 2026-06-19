package com.bilibili.tgwt.im.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.databinding.BindingAdapter;
import com.bilibili.bangumi.module.chatroom.ChatRoomFateLabel;
import com.bilibili.lib.theme.R$color;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/widget/G.class */
public final class G {
    @BindingAdapter({"initTagView"})
    public static final void a(@NotNull LinearLayout linearLayout, @Nullable List<ChatRoomFateLabel> list) {
        String strF;
        linearLayout.removeAllViews();
        if (list == null || list.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        for (ChatRoomFateLabel chatRoomFateLabel : list) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
            if (chatRoomFateLabel == null || (strF = chatRoomFateLabel.f()) == null || strF.length() == 0) {
                appCompatTextView.setVisibility(8);
            } else {
                appCompatTextView.setVisibility(0);
                Context context = appCompatTextView.getContext();
                float f7 = 12;
                appCompatTextView.setPadding(Uj0.c.b(f7, context), Uj0.c.b(4.5f, appCompatTextView.getContext()), Uj0.c.b(f7, appCompatTextView.getContext()), Uj0.c.b(4.5f, appCompatTextView.getContext()));
                appCompatTextView.setText(chatRoomFateLabel.f());
                appCompatTextView.setTextSize(12.0f);
                appCompatTextView.setGravity(17);
                appCompatTextView.setBackground(AppCompatResources.getDrawable(appCompatTextView.getContext(), 2131240701));
                Drawable background = appCompatTextView.getBackground();
                if (Cj0.a.a(appCompatTextView.getContext())) {
                    Context context2 = appCompatTextView.getContext();
                    Integer numE = chatRoomFateLabel.e();
                    appCompatTextView.setTextColor(numE != null ? numE.intValue() : ContextCompat.getColor(context2, R$color.Pi5));
                    GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                    if (gradientDrawable != null) {
                        Context context3 = appCompatTextView.getContext();
                        Integer numB = chatRoomFateLabel.b();
                        gradientDrawable.setColor(numB != null ? numB.intValue() : ContextCompat.getColor(context3, R$color.Pi5));
                    }
                } else {
                    Context context4 = appCompatTextView.getContext();
                    Integer numD = chatRoomFateLabel.d();
                    appCompatTextView.setTextColor(numD != null ? numD.intValue() : ContextCompat.getColor(context4, R$color.Pi5));
                    GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                    if (gradientDrawable2 != null) {
                        Context context5 = appCompatTextView.getContext();
                        Integer numA = chatRoomFateLabel.a();
                        gradientDrawable2.setColor(numA != null ? numA.intValue() : ContextCompat.getColor(context5, R$color.Pi5));
                    }
                }
                ViewCompat.setBackground(appCompatTextView, background);
            }
            linearLayout.addView(appCompatTextView);
            ((LinearLayout.LayoutParams) appCompatTextView.getLayoutParams()).setMargins(0, 0, Uj0.c.b(6, linearLayout.getContext()), 0);
        }
    }
}
