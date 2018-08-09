package com.boot.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = false)
public class Picture {

    private int clue_sumbit_id;
    private int clue_id;
    private String clue_submit_card1;
    private String clue_submit_card2;
    private String clue_submit_card3;
    private String clue_submit_card4;


}
