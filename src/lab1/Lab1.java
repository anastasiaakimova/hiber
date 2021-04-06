
package lab1;

import db.NewHibernateUtil;
import entity.Studentyi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 18738
 */

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            ResultSet rs = null;
            Session session = NewHibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            String hql = "FROM Studentyi ";
            Query query = session.createQuery(hql);

            List <Studentyi> studentyi = query.list();
            studentyi.size();

            for (int i=0; i<=studentyi.size(); i++) {
                System.out.println("\t" + studentyi.get(i).getFamiliya()  + "\t"
                        + studentyi.get(i).getImya() + "\t"
                         + studentyi.get(i).getOtchestvo() + "\t"
                        + studentyi.get(i).getGruppyi().getNazvanie());
            }

            for(int i = 0; i<= studentyi.size();i++){
              System.out.println("\t" + studentyi.get(i).getFamiliya());
            }

//               String hql1 = "select count(e) from Entity e";
//            Query query1 = session.createQuery(hql1);
    }
}
