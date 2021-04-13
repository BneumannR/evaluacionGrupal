package cl.douc.evaluaciongrupal2.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import cl.douc.evaluaciongrupal2.R;

public class GaleriaFotosAdapter extends BaseAdapter {
    private Context mContext;
    public  int[] imageArray = {
            R.drawable.galeria1,R.drawable.galeria2,R.drawable.galeria3,R.drawable.galeria4,R.drawable.galeria5,R.drawable.galeria6,
            R.drawable.galeria7,R.drawable.galeria8,R.drawable.galeria9, R.drawable.galeria10,R.drawable.galeria11,R.drawable.galeria12,
            R.drawable.galeria13,R.drawable.galeria14,R.drawable.galeria15};

    public GaleriaFotosAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));

        return imageView;
    }
}
