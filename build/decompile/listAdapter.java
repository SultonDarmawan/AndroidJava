/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 */
package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication2.tense;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/example/myapplication2/listAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myapplication2/listAdapter$ListViewHolder;", "listTense", "Ljava/util/ArrayList;", "Lcom/example/myapplication2/tense;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onItemClickCallback", "Lcom/example/myapplication2/listAdapter$OnItemClickCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallback", "ListViewHolder", "OnItemClickCallback", "app_debug"})
public final class listAdapter
extends RecyclerView.Adapter<ListViewHolder> {
    @NotNull
    private final ArrayList<tense> listTense;
    private OnItemClickCallback onItemClickCallback;

    public listAdapter(@NotNull ArrayList<tense> listTense) {
        Intrinsics.checkNotNullParameter(listTense, "listTense");
        this.listTense = listTense;
    }

    public final void setOnItemClickCallback(@NotNull OnItemClickCallback onItemClickCallback) {
        Intrinsics.checkNotNullParameter(onItemClickCallback, "onItemClickCallback");
        this.onItemClickCallback = onItemClickCallback;
    }

    @NotNull
    public ListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter((Object)parent, "parent");
        View view = LayoutInflater.from((Context)parent.getContext()).inflate(2131558458, parent, false);
        Intrinsics.checkNotNullExpressionValue((Object)view, "from(parent.context).inf\u2026_material, parent, false)");
        View view2 = view;
        return new ListViewHolder(view2);
    }

    public void onBindViewHolder(@NotNull ListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter((Object)holder, "holder");
        tense tense2 = this.listTense.get(position);
        String name = tense2.component1();
        int foto = tense2.component2();
        holder.getImgPhoto().setImageResource(foto);
        holder.getTvName().setText((CharSequence)name);
        holder.itemView.setOnClickListener(arg_0 -> listAdapter.onBindViewHolder$lambda$0(this, holder, arg_0));
    }

    public int getItemCount() {
        return this.listTense.size();
    }

    private static final void onBindViewHolder$lambda$0(listAdapter this$0, ListViewHolder $holder, View it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$holder, "$holder");
        OnItemClickCallback onItemClickCallback = this$0.onItemClickCallback;
        if (onItemClickCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onItemClickCallback");
            onItemClickCallback = null;
        }
        tense tense2 = this$0.listTense.get($holder.getAdapterPosition());
        Intrinsics.checkNotNullExpressionValue(tense2, "listTense[holder.adapterPosition]");
        onItemClickCallback.onItemClicked(tense2);
    }

    @Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lcom/example/myapplication2/listAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgPhoto", "Landroid/widget/ImageView;", "getImgPhoto", "()Landroid/widget/ImageView;", "tvName", "Landroid/widget/TextView;", "getTvName", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ListViewHolder
    extends RecyclerView.ViewHolder {
        @NotNull
        private final ImageView imgPhoto;
        @NotNull
        private final TextView tvName;

        public ListViewHolder(@NotNull View itemView) {
            Intrinsics.checkNotNullParameter((Object)itemView, "itemView");
            super(itemView);
            View view = itemView.findViewById(2131362041);
            Intrinsics.checkNotNullExpressionValue((Object)view, "itemView.findViewById(R.id.iv_material)");
            this.imgPhoto = (ImageView)view;
            View view2 = itemView.findViewById(2131362318);
            Intrinsics.checkNotNullExpressionValue((Object)view2, "itemView.findViewById(R.id.tv_title_material)");
            this.tvName = (TextView)view2;
        }

        @NotNull
        public final ImageView getImgPhoto() {
            return this.imgPhoto;
        }

        @NotNull
        public final TextView getTvName() {
            return this.tvName;
        }
    }

    @Metadata(mv={1, 8, 0}, k=1, xi=48, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2={"Lcom/example/myapplication2/listAdapter$OnItemClickCallback;", "", "onItemClicked", "", "data", "Lcom/example/myapplication2/tense;", "app_debug"})
    public static interface OnItemClickCallback {
        public void onItemClicked(@NotNull tense var1);
    }
}
