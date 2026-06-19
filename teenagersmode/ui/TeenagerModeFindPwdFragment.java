package com.bilibili.teenagersmode.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.utils.ThemeUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kntr.base.utils.foundation.InputMethodManagerHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagerModeFindPwdFragment.class */
public class TeenagerModeFindPwdFragment extends BaseFragment {
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131500142, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (p3() != null) {
            InputMethodManagerHelper.tryHideSoftInput(p3());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(2131298661);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        fragmentActivityP3.setTitle(getString(2131856001));
        String strDd = DeviceDecision.INSTANCE.dd("teenagers_mode_find_pwd_text_v2", getString(2131856012));
        Matcher matcher = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z.]{2,4}").matcher(strDd);
        if (matcher.find()) {
            String strGroup = matcher.group();
            int iIndexOf = strDd.indexOf(strGroup);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strDd);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ThemeUtils.getColorById(fragmentActivityP3, R$color.Text_link)), iIndexOf, strGroup.length() + iIndexOf, 33);
            textView.setText(spannableStringBuilder);
        } else {
            textView.setText(strDd);
        }
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}
