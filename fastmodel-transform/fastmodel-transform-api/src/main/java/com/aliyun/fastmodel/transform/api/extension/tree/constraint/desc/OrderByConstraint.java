package com.aliyun.fastmodel.transform.api.extension.tree.constraint.desc;

import java.util.List;

import com.aliyun.fastmodel.core.tree.IAstVisitor;
import com.aliyun.fastmodel.core.tree.Node;
import com.aliyun.fastmodel.core.tree.expr.Identifier;
import com.aliyun.fastmodel.transform.api.extension.visitor.ExtensionAstVisitor;
import lombok.Getter;

/**
 * OrderByConstraint
 *
 * @author panguanjing
 * @date 2023/12/13
 */
@Getter
public class OrderByConstraint extends NonKeyConstraint {

    public static final String TYPE = "OrderBy";

    private final List<Identifier> columns;

    public OrderByConstraint(Identifier constraintName, Boolean enable, List<Identifier> columns) {
        super(constraintName, enable, TYPE);
        this.columns = columns;
    }

    public OrderByConstraint(Identifier constraintName, List<Identifier> columns) {
        super(constraintName, true, TYPE);
        this.columns = columns;
    }

    @Override
    public <R, C> R accept(IAstVisitor<R, C> visitor, C context) {
        ExtensionAstVisitor<R, C> extensionVisitor = (ExtensionAstVisitor<R, C>)visitor;
        return extensionVisitor.visitOrderByConstraint(this, context);
    }

    @Override
    public List<? extends Node> getChildren() {
        return columns;
    }
}