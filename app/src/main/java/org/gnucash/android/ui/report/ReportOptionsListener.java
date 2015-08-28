/*
 * Copyright (c) 2015 Ngewi Fet <ngewif@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gnucash.android.ui.report;

/**
 * Listener interface for passing reporting options from activity to the report fragments
 */
public interface ReportOptionsListener {

    /**
     * Notify the implementing class of the selected date range
     * @param start Start date in milliseconds since epoch
     * @param end End date in milliseconds since epoch
     */
    public void updateDateRange(long start, long end);

    //TODO: Add interface method for change in currency
}
