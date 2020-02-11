/*
 * MIT License
 *
 * Copyright © 2020 Bukkit Commons Studio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.maxgamer.quickshop.handle;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.maxgamer.quickshop.Manager;
import org.maxgamer.quickshop.Shop;
import org.maxgamer.quickshop.ShopType;
import org.maxgamer.quickshop.Stack;

import java.util.List;

@RequiredArgsConstructor
public final class ShopBasic implements Shop {

    @NotNull
    private final Manager manager;

    @NotNull
    private final ShopType shopType;

    @NotNull
    private final List<Stack> stacks;

    @NotNull
    @Override
    public Manager getManager() {
        return manager;
    }

    @NotNull
    @Override
    public ShopType getShopType() {
        return shopType;
    }

    @NotNull
    @Override
    public List<Stack> getStacks() {
        return stacks;
    }
}
