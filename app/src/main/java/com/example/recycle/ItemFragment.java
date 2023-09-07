        package com.example.recycle;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recycle.placeholder.PlaceholderContent;

import java.util.ArrayList;
import java.util.List;

        /**
 * A fragment representing a list of Items.
 */
public class ItemFragment extends Fragment {

    List<Orden> ordenesList;
    MyItemRecyclerViewAdapter adapter;

    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;


    public ItemFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            //recyclerView.setAdapter(new MyItemRecyclerViewAdapter(PlaceholderContent.ITEMS));
            ordenesList = new ArrayList<>();
            ordenesList.add(new Orden("00000100","01258","20/11/2023"));
            ordenesList.add(new Orden("00000030","01258","10/10/2023"));
            ordenesList.add(new Orden("00000023","01258","13/09/2023"));
            ordenesList.add(new Orden("00000015","01258","12/09/2023"));
            ordenesList.add(new Orden("00000010","01258","23/08/2023"));
            ordenesList.add(new Orden("00000005","01258","15/07/2023"));
            ordenesList.add(new Orden("00000003","01258","03/05/2023"));
            ordenesList.add(new Orden("00000001","01258","09/02/2023"));
            ordenesList.add(new Orden("00000105","01258","20/11/2023"));
            ordenesList.add(new Orden("00000030","01258","10/10/2023"));
            ordenesList.add(new Orden("00000023","01258","13/09/2023"));


            adapter = new MyItemRecyclerViewAdapter(getActivity(),ordenesList, (MyItemRecyclerViewAdapter.OnListFragmentInteractionListener) mListener);
            recyclerView.setAdapter(adapter);

        }
        return view;
    }
            public interface OnListFragmentInteractionListener {
                void onListFragmentInteraction(Orden item);
            }

}