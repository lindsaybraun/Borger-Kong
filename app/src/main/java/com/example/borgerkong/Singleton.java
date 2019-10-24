package com.example.borgerkong;

import android.util.Log;

//use to store qty info across app

public class Singleton {
        private static Singleton uniqInstance;
        public String[] qty = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};

        private Singleton() {
        }
        public static Singleton getInstance() {
            if (uniqInstance == null) {
                {
                    if (uniqInstance == null)
                        uniqInstance = new Singleton();
                }
            }
            return uniqInstance;
        }
        public void updateQty(String[] qty)
        {
            for(int i=0; i< this.qty.length; i++){
                this.qty[i] = String.valueOf(Integer.parseInt(this.qty[i]) + Integer.parseInt(qty[i]));
            }



        }
        public String[] getArray()
        {
            return this.qty;

        }
}
