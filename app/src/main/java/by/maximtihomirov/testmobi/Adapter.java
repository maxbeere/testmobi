package by.maximtihomirov.testmobi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Максим on 06.07.2018.
 */

public class Adapter extends RecyclerView.Adapter<MyViewHolder>{

    Context R;
    List<MyModel> myModel;

    Adapter(List<MyModel> myModel) {
        this.myModel = myModel;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(by.maximtihomirov.testmobi.R.layout.item_card, parent, false);
        MyViewHolder mVH = new MyViewHolder(v);
        return (mVH);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, ContentActivity.class);
                intent.putExtra("NAME_ANIMAL", holder.mTitle.getText());
                context.startActivity(intent);

            }
        });

        holder.mTitle.setText(myModel.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return myModel.size();
    }
}
