package co.edu.uptc.interfaces;

public interface iEVDContract {

    public interface Model {
        public void setPresenter(Presenter presenter);
    }

    public interface View {
        public void setPresenter(Presenter presenter);
        public void begin();

    }

    public interface Presenter {
        public void setView(View view);
        public void setModel(Model model);
    }
}