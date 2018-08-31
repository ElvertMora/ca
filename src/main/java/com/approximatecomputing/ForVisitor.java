package com.approximatecomputing;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ForVisitor<T> extends CBaseVisitor<T> {

    private List<CParser.IterationstatementContext> pila = new ArrayList<CParser.IterationstatementContext>();



    private List<CParser.IterationstatementContext> pilactx = new ArrayList<CParser.IterationstatementContext>();

    @Override public T visitIterationstatement(CParser.IterationstatementContext ctx) {

        if (ctx.forinitstatement()!=null ){
            for (ParseTree  cild:ctx.statement().children) {
                ForVisitor forVisitor = new ForVisitor();
                forVisitor.visit(cild);
                if(forVisitor.getPila().size()==0){
                    pilactx.add(ctx);
                }
            }
            pila.add(ctx)  ;
        }
        return visitChildren(ctx); }

    public List<CParser.IterationstatementContext> getPila() {
        return pila;
    }

    public List<CParser.IterationstatementContext> getPilactx() {
        return pilactx;
    }
}
