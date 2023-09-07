package com.example.recycle;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recycle.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.recycle.databinding.FragmentItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyItemRecyclerViewAdapter extends RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder> {

    private Context ctx;
    private final List<Orden> mValues;
    private final OnListFragmentInteractionListener mListener;

    public MyItemRecyclerViewAdapter(Context context, List<Orden> items, OnListFragmentInteractionListener listener) {
        ctx = context;
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textOrden.setText(holder.mItem.getNoOrden());
        holder.textFecha.setText(holder.mItem.getFecha());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView textOrden;
        public final TextView textFecha;
        public Orden mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            textOrden = binding.idOrden;
            textFecha = binding.fecha;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textOrden.getText() + "'";
        }
    }

    public interface OnListFragmentInteractionListener {
        void onListFragmentInteraction(Orden item);
    }
}