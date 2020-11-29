package service;

import com.Dao.NodeDao;
import domain.Node;

import java.util.List;

public class NodeService {
    NodeDao dao = new NodeDao();
    public List<Node> getHot(){
        return dao.getNodesByLike();
    }
    public List<Node> getNew(){
        return dao.getNodesByTime();
    }
    public List<Node> getNode(String plateName){
        return dao.getNodesByPlateName(plateName);
    }
}
