package cc.cc1234.manager;

import cc.cc1234.spi.listener.PrettyZooConfigChangeListener;
import cc.cc1234.spi.listener.ServerListener;
import cc.cc1234.spi.listener.ZookeeperNodeListener;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ListenerManager {

    /**
     * singleton instance
     */
    private static final ListenerManager instance = new ListenerManager();

    private List<PrettyZooConfigChangeListener> prettyZooConfigChangeListeners = new ArrayList<>();

    private List<ZookeeperNodeListener> zookeeperNodeListeners = new ArrayList<>();

    private List<ServerListener> serverListeners = new ArrayList<>();

    public static ListenerManager instance() {
        return instance;
    }

    public void add(PrettyZooConfigChangeListener listener) {
        prettyZooConfigChangeListeners.add(listener);
    }

    public void remove(PrettyZooConfigChangeListener listener) {
        prettyZooConfigChangeListeners.remove(listener);
    }

    public void add(ZookeeperNodeListener listener) {
        zookeeperNodeListeners.add(listener);
    }

    public void remove(ZookeeperNodeListener listener) {
        zookeeperNodeListeners.remove(listener);
    }

    public void add(ServerListener listener) {
        serverListeners.add(listener);
    }

    public void remove(ServerListener listener) {
        prettyZooConfigChangeListeners.remove(listener);
    }

    public List<ZookeeperNodeListener> getZookeeperNodeListeners() {
        return zookeeperNodeListeners;
    }

    public List<PrettyZooConfigChangeListener> getPrettyZooConfigChangeListeners() {
        return prettyZooConfigChangeListeners;
    }

    public List<ServerListener> getServerListeners() {
        return serverListeners;
    }

    public void clear() {
        prettyZooConfigChangeListeners.clear();
        zookeeperNodeListeners.clear();
    }
}
