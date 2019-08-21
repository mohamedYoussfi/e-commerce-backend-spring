package org.sid.lightecomv1.web;

import lombok.Data;
import org.sid.lightecomv1.entities.Client;

import java.util.ArrayList;
import java.util.List;
@Data
public class OrderForm {
    private Client client=new Client();
    private List<OrderProduct> products=new ArrayList<>();
}
@Data
class OrderProduct{
    private Long id;
    private int quantity;

}
