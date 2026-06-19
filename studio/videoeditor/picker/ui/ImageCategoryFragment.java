package com.bilibili.studio.videoeditor.picker.ui;

import Ei.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.biligame.ui.feed.widget.bottomtip.K;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.BiliImageLoaderHelper;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.moudle.sticker.ui.BiliEditorStickerImagePickerActivity;
import com.bilibili.studio.editor.moudle.sticker.v1.MediaDirectory;
import com.bilibili.studio.videoeditor.picker.bean.ImageFolder;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/ImageCategoryFragment.class */
public final class ImageCategoryFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f109884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f109885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f109886d = DensityUtil.dp2px(230.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f109887e = DensityUtil.dp2px(50.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f109888f = 300;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f109889g;
    public List<? extends ImageFolder> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BiliEditorStickerImagePickerActivity.a f109891j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/ImageCategoryFragment$a.class */
    public final class a extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageCategoryFragment f109892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ImageCategoryFragment imageCategoryFragment, View view) {
            super(view);
            this.f109892a = imageCategoryFragment;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            BiliEditorStickerImagePickerActivity.a aVar = this.f109892a.f109891j;
            if (aVar != null) {
                BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity = aVar.f108086a;
                biliEditorStickerImagePickerActivity.getClass();
                DirChooseImgFragment dirChooseImgFragment = new DirChooseImgFragment();
                dirChooseImgFragment.f109882d = biliEditorStickerImagePickerActivity.f108085K;
                biliEditorStickerImagePickerActivity.getSupportFragmentManager().beginTransaction().add(2131298614, dirChooseImgFragment, "DirChooseImgFragment").commitNowAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/ImageCategoryFragment$b.class */
    public final class b extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<? extends ImageFolder> f109893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageCategoryFragment f109894b;

        public b(@Nullable ImageCategoryFragment imageCategoryFragment, List<? extends ImageFolder> list) {
            this.f109894b = imageCategoryFragment;
            this.f109893a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<? extends ImageFolder> list = this.f109893a;
            return (list != null ? list.size() : 0) + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i7) {
            List<? extends ImageFolder> list = this.f109893a;
            return (list == null || i7 >= list.size()) ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i7) {
            List<? extends ImageFolder> list = this.f109893a;
            if (list == null || i7 >= list.size()) {
                return;
            }
            c cVar = (c) viewHolder;
            ImageFolder imageFolder = this.f109893a.get(i7);
            cVar.f109897c.setText(K.b(imageFolder.childrenSize, imageFolder.name, " (", ")"));
            String strFileToUri = BiliImageLoaderHelper.fileToUri(new File(imageFolder.coverPath));
            ImageRequestBuilder imageRequestBuilderWith = BiliImageLoader.INSTANCE.with(cVar.f109896b.getContext());
            ImageCategoryFragment imageCategoryFragment = this.f109894b;
            imageRequestBuilderWith.overrideHeight(imageCategoryFragment.f109887e).overrideWidth(imageCategoryFragment.f109887e).url(strFileToUri).into(cVar.f109896b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i7) {
            RecyclerView.ViewHolder aVar;
            ImageCategoryFragment imageCategoryFragment = this.f109894b;
            if (i7 == 0) {
                aVar = new c(imageCategoryFragment, this.f109893a, p.a(viewGroup, 2131498302, viewGroup, false));
            } else {
                aVar = new a(imageCategoryFragment, p.a(viewGroup, 2131498301, viewGroup, false));
            }
            return aVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/picker/ui/ImageCategoryFragment$c.class */
    public final class c extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<? extends ImageFolder> f109895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final BiliImageView f109896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final TextView f109897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageCategoryFragment f109898d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@Nullable ImageCategoryFragment imageCategoryFragment, @NotNull List<? extends ImageFolder> list, View view) {
            super(view);
            this.f109898d = imageCategoryFragment;
            this.f109895a = list;
            this.f109896b = view.findViewById(2131302766);
            this.f109897c = (TextView) view.findViewById(2131310812);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            BiliEditorStickerImagePickerActivity biliEditorStickerImagePickerActivity;
            List<MediaDirectory> list;
            BiliEditorStickerImagePickerActivity.a aVar = this.f109898d.f109891j;
            if (aVar != null) {
                int adapterPosition = getAdapterPosition();
                this.f109895a.get(getAdapterPosition());
                if (adapterPosition < 0 || (list = (biliEditorStickerImagePickerActivity = aVar.f108086a).f108082H) == null || adapterPosition >= ((ArrayList) list).size()) {
                    return;
                }
                MediaDirectory mediaDirectory = (MediaDirectory) ((ArrayList) biliEditorStickerImagePickerActivity.f108082H).get(adapterPosition);
                if (biliEditorStickerImagePickerActivity.f108081G != mediaDirectory) {
                    biliEditorStickerImagePickerActivity.f108081G = mediaDirectory;
                    biliEditorStickerImagePickerActivity.S6(mediaDirectory);
                }
                biliEditorStickerImagePickerActivity.V6(true);
            }
        }
    }

    @NotNull
    public final RecyclerView hf() {
        RecyclerView recyclerView = this.f109884b;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRv");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(2131498303, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        this.f109890i = arguments != null ? arguments.getInt("KEY_SELECTED_POS") : 0;
        Bundle arguments2 = getArguments();
        List<? extends ImageFolder> list = (List) (arguments2 != null ? arguments2.getSerializable("KEY_FOLDER_LIST") : null);
        this.h = list;
        int i7 = this.f109890i;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFolderList");
            list = null;
        }
        if (i7 >= list.size()) {
            return;
        }
        view.findViewById(2131297454).setOnClickListener(new e(this, 1));
        this.f109885c = (ImageView) view.findViewById(2131304056);
        this.f109884b = (RecyclerView) view.findViewById(2131308035);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        hf().setLayoutManager(linearLayoutManager);
        hf().setY(-this.f109886d);
        TextView textView = (TextView) view.findViewById(2131308958);
        List<? extends ImageFolder> list2 = this.h;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFolderList");
            list2 = null;
        }
        if (!TextUtils.isEmpty(list2.get(this.f109890i).name)) {
            List<? extends ImageFolder> list3 = this.h;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFolderList");
                list3 = null;
            }
            textView.setText(list3.get(this.f109890i).name);
        }
        RecyclerView recyclerViewHf = hf();
        List<? extends ImageFolder> list4 = this.h;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFolderList");
            list4 = null;
        }
        recyclerViewHf.setAdapter(new b(this, list4));
        linearLayoutManager.scrollToPosition(this.f109890i);
        if (this.f109889g) {
            return;
        }
        this.f109889g = true;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = hf().animate();
        viewPropertyAnimatorAnimate.y(0.0f);
        viewPropertyAnimatorAnimate.setDuration(this.f109888f);
        viewPropertyAnimatorAnimate.start();
        ImageView imageView = this.f109885c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIv");
            imageView = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = imageView.animate();
        viewPropertyAnimatorAnimate2.rotationBy(180.0f);
        viewPropertyAnimatorAnimate2.setDuration(this.f109888f);
        viewPropertyAnimatorAnimate2.withEndAction(new TO.a(this, 1));
        viewPropertyAnimatorAnimate2.start();
    }
}
