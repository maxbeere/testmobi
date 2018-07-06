package by.maximtihomirov.testmobi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Максим on 06.07.2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder{

    TextView mTitle;
    public final View mView;

    MyViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mTitle = (TextView) itemView.findViewById(R.id.title);
    }
}
